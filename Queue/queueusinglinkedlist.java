public class queueusinglinkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;

            if (head == tail) {
                // last element
                head = tail = null;
            } else {
                head = head.next;
            }

            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Peek: " + q.peek()); // 10

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
