import main.java.data_structure.structure.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    // adds one string to list
    @Test
    public void LLTAddStrings1() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Test");
        assertEquals("Test", list.at(0));
    }

    // adds multiple elements
    @Test
    public void LLTAddStrings2() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Test");
        list.add("Foo");
        assertEquals("Foo", list.at(1));
    }

    // tests integers, positive and negative
    @Test
    public void LLTAddInts() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(134);
        list.add(4234);
        list.add(-864);
        list.add(734);
        list.add(-95);
        System.out.println("Length of LinkedList after adding elements: " + list.size());
        assertEquals(134, list.at(0));
        assertEquals(4234, list.at(1));
        assertEquals(-864, list.at(2));
        assertEquals(734, list.at(3));
        assertEquals(-5, list.at(4));
    }

    // tests modification of list - removal of items
    @Test
    public void LLTRemove() {
        LinkedList<String> list = new LinkedList<>();
        list.add("We're no strangers to love"); // 0
        list.add("You know the rules and so do I"); // 1
        list.add("A full commitment's what I'm thinking of"); // 2
        list.add("You won't get this from any other guy"); // 3
        System.out.println("Length of LinkedList before modifying elements: " + list.size());
        list.remove(2);
        System.out.println("Length of LinkedList after modifying elements: " + list.size());
        assertEquals("We're no strangers to love", list.at(0)); // pass
        assertNotEquals("You know the rules and so do I", list.at(1)); // fail
        assertEquals("A full commitment's what I'm thinking of", list.at(1)); // pass
        assertEquals("You won't get this from any other guy", list.at(2)); // pass
    }

    // way to add elements to a specific index
    @Test
    public void LLTNewAdd() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Wake up");
        list.add("Time for breakfast");
        list.add(1, "Sheep"); // should add "Sheep" to index 1 and shift all other entries to the left
        System.out.println("Length of LinkedList after adding elements: " + list.size());
        assertEquals("Sheep", list.at(1));
        assertEquals("Time for breakfast", list.at(2));
    }

    // tests linked list with doubles using all modifications previously tested
    @Test
    public void LLTRemove2() {
        LinkedList<Double> list = new LinkedList<>();
        list.add(3.1415); // starting element, ends up in index 2
        list.add(0, 2.71828); // takes index 0
        list.add(1, 7.3890561); // takes index 1
        list.add(1.57079633); // takes index 3
        System.out.println("Length of LinkedList after adding elements: " + list.size());
        assertNotEquals(3.1415, list.at(0)); // 3.14 moves to index 1
        assertEquals(2.71828, list.at(0)); // 2.17 takes 3.14's previous index, 0
        assertEquals(7.3890561, list.at(1)); // 7.38 moves 3.14 to index 2
        assertEquals(3.1415, list.at(2)); // final position of 3.14
        //assertEquals(1.57079633, list.at(3)); //1.57 is added on last, placing it in index 3
    }

    @Test
    public void LLTAddException1() {
        LinkedList<String> list = new LinkedList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> list.at(0));
    }

    @Test
    public void LLTAddException2() {
        LinkedList<String> list = new LinkedList<>();
        list.add("foo");
        assertThrows(IndexOutOfBoundsException.class, () -> list.at(1));
    }
}
