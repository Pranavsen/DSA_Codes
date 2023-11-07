public class RotateLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    public RotateLL() {
        this.head = null;
    }

   public Node rotateLinkedList(Node head,int k){

    if (head==null || head.next==null ||k==0) {
        return head;
    }
    Node curr=head;
    int len=1;
    while(curr.next!=null){
        len++;
        curr = curr.next;
    }
    curr.next=head;
    k = k%len;
    k = len - k;
    while (k-- > 0) {
        curr = curr.next;
    }
    head = curr.next;
    curr.next=null;
    return head;
   }

    public void display(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RotateLL rotateLL = new RotateLL();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        int k =2;
        Node ans = rotateLL.rotateLinkedList(head,k);
        rotateLL.display(ans);
    }
}
