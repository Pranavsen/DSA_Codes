import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Vector;

public class TopView {

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

    public static Vector<Integer> mytopView(Node root) {
        class Pair {
            Node node;
            int line;

            Pair(Node node, int line) {
                this.node = node;
                this.line = line;
            }
        }
        Vector<Integer> ans = new Vector<>();
        Map<Integer, Integer> map = new TreeMap<>();
        if (root == null)
            return ans;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair it = q.remove();
            int line = it.line;
            Node temp = it.node;
            if (map.get(line) == null)
                map.put(line, temp.data);
            if (temp.left != null) {

                q.add(new Pair(temp.left, line - 1));
            }
            if (temp.right != null) {

                q.add(new Pair(temp.right, line + 1));
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
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

        Vector<Integer> ans = mytopView(root);
        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }

    }
}