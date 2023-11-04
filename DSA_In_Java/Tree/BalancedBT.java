public class BalancedBT {
    private static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static boolean isBalanced(Node root) {
        return dfsheight(root) != -1;

    }

    static int dfsheight(Node root) {
        if (root == null)
            return 0;
        int leftHeight = dfsheight(root.left);
        if (leftHeight == -1)
            return -1;
        int rightheight = dfsheight(root.right);
        if (rightheight == -1)
            return -1;
        if (Math.abs(rightheight - leftHeight) > 1)
            return -1;
        return Math.max(leftHeight, rightheight) + 1;
    };

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.left = new Node(2);
        root.left.right.right = new Node(8);

        if (isBalanced(root)) {
            System.out.println("Tree is Balanced Tree.");
        } else {
            System.out.println("Not a balanced Tree.");
        }

    }
}
