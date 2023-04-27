package codechallenge8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ZippedLinkedListTest {

    @Test
    public void testAdd() {
        ZippedLinkedList.LinkedList list = new ZippedLinkedList.LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(1, list.head.value);
        assertEquals(2, list.head.next.value);
        assertEquals(3, list.head.next.next.value);
    }

    @Test
    public void testZipLists() {
        ZippedLinkedList.LinkedList list1 = new ZippedLinkedList.LinkedList();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        ZippedLinkedList.LinkedList list2 = new ZippedLinkedList.LinkedList();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        ZippedLinkedList.LinkedList zippedList = ZippedLinkedList.zipLists(list1, list2);
        int[] expectedValues = {1, 2, 3, 4, 5, 6};
        int i = 0;
        ZippedLinkedList.Node current = zippedList.head;
        while (current != null) {
            assertEquals(expectedValues[i], current.value);
            current = current.next;
            i++;
        }
    }

    @Test
    public void testZipListsOneEmpty() {
        ZippedLinkedList.LinkedList list1 = new ZippedLinkedList.LinkedList();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        ZippedLinkedList.LinkedList list2 = new ZippedLinkedList.LinkedList();

        ZippedLinkedList.LinkedList zippedList = ZippedLinkedList.zipLists(list1, list2);
        int[] expectedValues = {1, 3, 5};
        int i = 0;
        ZippedLinkedList.Node current = zippedList.head;
        while (current != null) {
            assertEquals(expectedValues[i], current.value);
            current = current.next;
            i++;
        }
    }

    @Test
    public void testZipListsBothEmpty() {
        ZippedLinkedList.LinkedList list1 = new ZippedLinkedList.LinkedList();
        ZippedLinkedList.LinkedList list2 = new ZippedLinkedList.LinkedList();

        ZippedLinkedList.LinkedList zippedList = ZippedLinkedList.zipLists(list1, list2);
        assertNull(zippedList.head);
    }
}
