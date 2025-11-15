package Tree;

public class diameteroftree2 {

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

    static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) { // Correct Constructor
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) { // O(N)
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int height = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        int diam1 = leftInfo.diam;
        int diam2 = rightInfo.diam;
        int diam3 = leftInfo.ht + rightInfo.ht + 1;

        int diameter = Math.max(diam3, Math.max(diam1, diam2));

        return new Info(diameter, height);
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

        Info ans = diameter(root);

        System.out.println(diameter(root).diam);
    }
}
