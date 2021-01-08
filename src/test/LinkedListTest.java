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
