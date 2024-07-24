package Queues;

public class QueueWithLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null; // Simplified check
        }

        public static void add(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }

            int temp = head.data;
            head = head.next;

            if (head == null) { // If the queue becomes empty
                tail = null;
            }

            return temp;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(4);
        q.add(5);
        q.add(6);
        q.remove();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
