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

    public Node add(Node head1, Node head2){
        
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

        Node head1 = new Node(4);
        head1.next = new Node(5);
        // head2.next.next = new Node(9);

        Node head2 = new Node(3);
        head2.next = new Node(4);
        head2.next.next = new Node(5);

        System.out.println("LinkedList 1  after adding One: ");
        Node sol1 = add2Number.addingNumber(head1,head2);
        add2Number.display(sol1);


        
    }
}
