public class TreeHeight {
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
   static int height(Node root){
    if(root==null) return -1;
    int l = height(root.left);    
    int r = height(root.right);
    return Math.max(l, r)+1;

   }
    
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.left = new Node(2);
        root.left.right.right = new Node(8);

        System.out.println("Height : "+ height(root));
        
    }
}
