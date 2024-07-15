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
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

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

    public void reverse() {
        Node prev = null;
        Node current = Tail = Head;
        Node next;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Head = prev;
    }

    public Node findMiddle() {

        Node slow = Head;
        Node fast = Head;

        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public boolean findLoop() {

        Node slow = Head;
        Node fast = Head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next;

            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(4);
        ll.addLast(5);
        ;

        ll.PrintLinkedList();
        ll.reverse();
        ll.PrintLinkedList();

    }
}
