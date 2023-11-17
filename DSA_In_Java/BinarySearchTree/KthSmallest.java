public class KthSmallest {
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

    public int ans;
public int count;
    public void solve(Node root, int k) {
        if (root == null) {
            return;
        }
        solve(root.left, k);
        if (k == count) {
            ans = root.data;
            count++;
        } else {
            count++;
        }
        solve(root.right, k);
    }

    public int kthSmall(Node root, int k) {
        count = 1;
        ans = -1;
        solve(root, k);
        return ans;
    }

    public static void main(String[] args) {
        KthSmallest kthSmallest = new KthSmallest();
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(11);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(9);
        root.right.right = new Node(12);

        int k = 2;
        int sol = kthSmallest.kthSmall(root, k);
        System.out.println("Kth Smallest element is : " + sol);

    }
}
