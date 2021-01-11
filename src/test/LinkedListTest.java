import main.java.data_structures.structure.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    public void LLTAdd1() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Test");
        assertEquals("Test", list.at(0));
    }

    @Test
    public void LLTAdd2() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Test");
        list.add("Foo");
        assertEquals("Foo", list.at(1));
    }

    @Test
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
