public class PalindromeLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    public PalindromeLL() {
        this.head = null;

    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        Node nex = null;
        Node curr = slow;
        while (curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }

        fast = head;
        while (prev != null) {
            if (fast.data != prev.data) {
                return false;
            }
            fast = fast.next;
            prev = prev.next;
        }
        return true;

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
        PalindromeLL palindromeLL = new PalindromeLL();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(1);

        System.out.println("LinkedList : ");
        palindromeLL.display(head);

        if (isPalindrome(head)) {
            System.out.println("List is Palindrome.");
        } else {
            System.out.println("List is not a Palindrome.");
        }
    }
}
