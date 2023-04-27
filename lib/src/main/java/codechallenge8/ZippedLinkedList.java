package codechallenge8;

public class ZippedLinkedList {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        public LinkedList() {
            this.head = null;
        }

        public void add(int value) {
            if (head == null) {
                head = new Node(value);
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(value);
            }
        }
    }

    public static LinkedList zipLists(LinkedList list1, LinkedList list2) {
        if (list1.head == null) return list2;
        if (list2.head == null) return list1;

        LinkedList zippedList = new LinkedList();
        zippedList.head = list1.head;
        Node list1Current = list1.head;
        Node list2Current = list2.head;

        while (list1Current != null && list2Current != null) {
            Node list1Next = list1Current.next;
            Node list2Next = list2Current.next;

            list1Current.next = list2Current;
            if (list1Next != null) {
                list2Current.next = list1Next;
            }

            list1Current = list1Next;
            list2Current = list2Next;
        }

        return zippedList;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        LinkedList list2 = new LinkedList();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        LinkedList zippedList = zipLists(list1, list2);
        Node current = zippedList.head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
