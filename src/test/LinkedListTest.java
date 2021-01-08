import main.java.data_structures.structure.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    public void LinkedListTestAdd1() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Test");
        assertEquals("Test", list.at(0));
    }

    @Test
    public void LinkedListTestAdd2() {
        LinkedList<String> list = new LinkedList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> list.at(0));
    }
}
