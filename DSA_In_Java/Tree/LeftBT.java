import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class LeftBT {
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

    public static Vector<Integer> leftview(Node root) {
        Vector<Integer> ans = new Vector<Integer>();
        Queue<Node> q = new LinkedList<>();
        if (root == null)
            return ans;
        q.add(root);
        while (!q.isEmpty()) {
            int sz = q.size();

            for (int i = 0; i < sz; i++) {
                Node temp = q.peek();
                q.poll();
                if (i == 0) {
                    ans.add(temp.data);
                }
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
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

        Vector<Integer> solution = leftview(root);
        for (Integer integer : solution) {
            System.out.print(integer + " ");
        }
    }
}
