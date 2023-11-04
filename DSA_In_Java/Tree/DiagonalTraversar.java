import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class DiagonalTraversar {
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

    public static Vector<Integer> diagonal(Node root) {
        Vector<Integer> ans = new Vector<>();
        Queue<Node> q = new LinkedList<>();

        if (root == null)
            return ans;
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.remove();

            while (temp != null) {
                if (temp.left != null)
                    q.add(temp.left);
                ans.add(temp.data);
                temp = temp.right;
            }
        }
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

        Vector<Integer> ans = diagonal(root);
        for (Integer it : ans) {
            System.out.print(it+" ");
        }
    }
}
