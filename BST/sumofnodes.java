package BST;

public class sumofnodes {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Sum of all nodes
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return sum(root.left) + sum(root.right) + root.data;
    }

    public static void main(String[] args) {

        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        // Build BST
        for (int value : values) {
            root = insert(root, value);
        }

        // Print sum of all nodes
        System.out.println(sum(root)); // Output = 22
    }
}
