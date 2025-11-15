import java.util.LinkedList;
import java.util.Queue;

public class stackusingtwoqueue {

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // check empty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // push element
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // pop element
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break; // last element (top of stack)
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        // peek element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top); // push back so element is not lost
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String args[]) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        System.out.println("Top element: " + Stack.peek()); // should print 3
        System.out.println("Popped: " + Stack.pop()); // should remove 3
        System.out.println("Popped: " + Stack.pop()); // should remove 2
        System.out.println("Top element: " + Stack.peek()); // should print 1
        System.out.println("Popped: " + Stack.pop()); // should remove 1
        System.out.println("Popped: " + Stack.pop()); // empty stack
    }
}
