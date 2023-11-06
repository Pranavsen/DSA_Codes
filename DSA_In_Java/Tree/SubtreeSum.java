public class SubtreeSum {
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

    static int ans;

    public static int solve(Node root) {
        if (root == null)
            return 0;
        int l = solve(root.left);
        int r = solve(root.right);
        ans = Math.max(ans, l + r + root.data);
        return Math.max(l, r) + root.data;
    }

    public static int subtreeSum(Node root) {
        ans = 0;
        solve(root);
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.left = new Node(2);
        root.left.right.right = new Node(8);

        System.out.println("Subtree Sum : " + subtreeSum(root));

    }
}
