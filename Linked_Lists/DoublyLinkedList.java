package Linked_Lists;

public class DoublyLinkedList {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {

            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int Size;

    public void addFirst(int Data) {
        Node newNode = new Node(2);
        Size++;

        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        newNode.next = Head;
        Head.prev = newNode;
        Head = newNode;

    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

    }

}
