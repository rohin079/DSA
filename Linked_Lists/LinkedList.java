package Linked_Lists;

public class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        newNode.next = Head;
        Head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        Tail.next = newNode;
        Tail = newNode;
        newNode.next = null;
    }

    public void PrintLinkedList() {
        Node temp = Head;

        if (Head == null) {
            System.out.println("Linked list is empty");
        }

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public void addMiddle(int index, int data) {

        if (index == 0) {
            addFirst(data);
        }

        Node newNode = new Node(data);

        Node temp = Head;

        int i = 0;

        while (i != index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(4);
        ll.addLast(5);
        ;

        ll.PrintLinkedList();

    }
}
