package Tree;

import java.util.*;

public class heightoftree {

    // Node class to represent each node of the binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to calculate height of the binary tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left); // left subtree height
        int rh = height(root.right); // right subtree height
        return Math.max(lh, rh) + 1; // max height + current node
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    public static void main(String[] args) {

        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of tree: " + height(root));
    }
}
