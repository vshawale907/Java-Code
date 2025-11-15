package BST;

// Assuming the package structure is correct and 'Tree.inordertraversal' is meant to be a local 'inorder' method.
// I've included the 'inorder' method directly in this class for completeness.

public class searchinbst {

    // --- Node Class ---
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // --- Insert Function ---
    public static Node insert(Node root, int val) {
        // Base case: If the current node is null, a new node is created and returned.
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // If the value is less than the current node's data, insert into the left
        // subtree.
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        // If the value is greater than or equal to the current node's data, insert into
        // the right subtree.
        // BSTs generally do not allow duplicates, but the '=' case is handled here for
        // a complete tree.
        else {
            root.right = insert(root.right, val);
        }

        // Return the (possibly updated) root of the subtree.
        return root;
    }

    // --- Inorder Traversal Function ---
    // Inorder traversal for a BST yields the elements in non-decreasing (sorted)
    // order.
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        }

        else {
            return search(root.right, key);
        }

    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    // --- Main Method ---
    public static void main(String args[]) {
        // The values to insert into the BST.
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null; // Start with an empty tree.

        // Build the BST by inserting all values.
        for (int value : values) {
            root = insert(root, value);
        }

        System.out.println("Inorder traversal of the built BST:");
        // Print the tree's elements in sorted order.
        inorder(root);
        System.out.println(); // Print a newline at the end.

        if (search(root, 1)) {
            System.out.println("found");
        } else {
            System.out.println("No found");
        }
    }
}