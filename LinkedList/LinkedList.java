import java.util.*;

public class LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add at start
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse linked list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Recursive search
    public int recSearch(int key, Node head) {
        if (head == null)
            return -1;
        if (head.data == key)
            return 0;

        int idx = recSearch(key, head.next);
        if (idx == -1)
            return -1;
        return idx + 1;
    }

    public int recSearch(int key) {
        return recSearch(key, head);
    }

    // Delete nth node from end
    public void deleteNthNodefromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n > sz)
            return; // edge case
        if (n == sz) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        if (prev.next != null)
            prev.next = prev.next.next;
    }

    // Find middle node
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Check if palindrome
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step1 - find mid
        Node midNode = findMid(head);

        // Step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // Step3 - compare left & right
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print(); // 1 -> 2 -> 2 -> 1 -> null
        ll.reverse();
        ll.print(); // 1 -> 2 -> 2 -> 1 -> null (reversed)
        ll.deleteNthNodefromEnd(3);
        ll.print(); // 1 -> 2 -> 1 -> null
        System.out.println(ll.recSearch(2)); // index of 2
        System.out.println(ll.checkPalindrome()); // true
    }
}
