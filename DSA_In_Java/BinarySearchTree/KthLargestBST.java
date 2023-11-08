public class KthLargestBST {
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

    public static int ans;

    public static void solve(Node root, int k, int count) {
        if (root == null) {
            return;
        }
        solve(root.right, k, count);
        if (k == count) {
            ans = root.data;
            return;
        } else {
            count++;
        }
        solve(root.left, k, count);
    }

    public static int kthLargest(Node root, int k) {
        int count = 1;
        ans = -1;
        solve(root, k, count);
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(11);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.right.left = new Node(10);

        int k = 2;
        int sol = kthLargest(root, k);
        System.out.println("Kth Largest element is : " + sol);

    }
}
