public class ReverseLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    public ReverseLL() {
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

    public void display(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLL reverseLL = new ReverseLL();
        reverseLL.head = new Node(2);
        reverseLL.head.next = new Node(4);
        reverseLL.head.next.next = new Node(6);
        reverseLL.head.next.next.next = new Node(8);
        reverseLL.head.next.next.next.next = new Node(10);
        reverseLL.head.next.next.next.next.next = new Node(12);
        reverseLL.head.next.next.next.next.next.next = new Node(14);

        System.out.println("Before Reverse : ");
        reverseLL.display(reverseLL.head);
        System.out.println("\nAfter Reversed : ");
        Node ans = reverseLL.ReverseNode(reverseLL.head);
        reverseLL.display(ans);
    }
}
