public class Add2Number {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    public Add2Number() {
        this.head = null;
    }
    
    Node ReverseNode(Node head) {
        Node curr = head;
        Node nex = null;
        Node prev = null;
        while (curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }

    public Node add(Node first, Node second){

        int carry =0;
        int sum=0;
        Node temp;
        Node res=null;
        Node curr=null;
        while (first!=null || second!=null) {
            sum = carry + (first != null?first.data:0) + (second != null?second.data:0);
            carry = sum>=10 ? 1:0;
            sum = sum % 10;
            temp = new Node(sum);
            if(res==null) res = temp;
            else curr.next = temp;
            curr=temp;

            if(first!=null) first = first.next;
            if(second!=null) second = second.next;
        }

        if(carry>0){
            temp = new Node(carry);
            curr.next = temp;
            curr=temp;
        }
        return res;
    }

    public Node addingNumber(Node head1,Node head2){
        // 1. Reverse input LL
        head1= ReverseNode(head1);
        head2 = ReverseNode(head2);

        // 2.add 2 LL 
        Node ans = add(head1,head2);

        ans = ReverseNode(ans);
        return ans;

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
        Add2Number add2Number = new Add2Number();

        Node head1 = new Node(9);
        head1.next = new Node(9);

        Node head2 = new Node(9);
        head2.next = new Node(9);
        head2.next.next = new Node(9);

        System.out.println("LinkedList 1  after adding One: ");
        Node sol1 = add2Number.addingNumber(head1,head2);
        add2Number.display(sol1);


        
    }
}
