import main.java.data_structure.structure.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test // adds one string to list
    public void LLTAdd1() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Test");
        assertEquals("Test", list.at(0));
    }

    @Test // adds multiple elements
    public void LLTAdd2() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Test");
        list.add("Foo");
        assertEquals("Foo", list.at(1));
    }

    @Test // tests integers, positive and negative
    public void LLTAdd3() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(134);
        list.add(4234);
        list.add(-864);
        list.add(734);
        list.add(95);
        assertEquals(134, list.at(0));
        assertEquals(4234, list.at(1));
        assertEquals(-864, list.at(2));
        assertEquals(734, list.at(3));
        assertEquals(95, list.at(4));
    }

    @Test // tests modification of list
    public void LLTRemove() {
        LinkedList<String> list = new LinkedList<>();
        list.add("We're no strangers to love"); //0
        list.add("You know the rules and so do I"); //1
        list.add("A full commitment's what I'm thinking of"); //2
        list.add("You won't get this from any other guy"); //3
        list.remove(2);
        assertEquals("We're no strangers to love", list.at(0)); //pass
        assertNotEquals("You know the rules and so do I", list.at(1)); //fail
        assertEquals("A full commitment's what I'm thinking of", list.at(1)); //pass
        assertEquals("You won't get this from any other guy", list.at(2)); //pass
    }

    @Test // way to add elements to a specific index
    public void LLTNewAdd() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Wake up");
        list.add("Time for breakfast");
        list.add(1, "Sheep"); // should add "Sheep" to index 1 and shift all other entries to the left
        assertEquals("Sheep", list.at(1));
        assertEquals("Time for breakfast", list.at(2));
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
