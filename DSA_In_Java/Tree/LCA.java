
public class LCA {
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

    public static Node LCAsolve(Node root,int n1,int n2){
        if(root==null) return null;
        if(root.data==n1 || root.data==n2){
            return root;
        }
        Node x= LCAsolve(root.left, n1, n2);
        Node y = LCAsolve(root.right, n1, n2);
        if( x==null) return y;
        else if(y==null) return x;
        else return root;
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.left = new Node(2);
        root.left.right.right = new Node(8);
        int n1=1;
        int n2 =8;
      Node ans = LCAsolve(root, n1, n2);
      System.out.println("Least common Ancector of "+n1+" & "+n2+": "+ans.data);
    }
}
