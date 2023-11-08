public class BSTsearch {
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

    public static Node searchTree(Node root, int key) {
        while (root != null) {
            if (key == root.data)
                return root;
            else if (key < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        
        int key = 6;
        Node ans = searchTree(root, key);
        System.out.println(ans.data);
    }
}