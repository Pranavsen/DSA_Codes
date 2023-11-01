package SingleLL;

import java.util.NoSuchElementException;

public class SingleLinkedList {
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node head;

    public SingleLinkedList() {
        this.head = null;
    }

    public void addAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void addAtSpecificPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else if (position > 0) {
            Node ptr = head;
            for (int i = 0; i < position - 1; i++) {
                ptr = ptr.next;
            }
            if (ptr != null) {
                newNode.next = ptr.next;
                ptr.next = newNode;
            }
        }
    }

    public int deleteAtBegin() {
        if (head == null) {
            throw new NoSuchElementException("list is Empty\n");
        } else {
            int data = head.data;
            head = head.next;
            return data;
        }
    }

    public int deleteAtEnd() {
        if (head == null) {
            throw new NoSuchElementException("List is empty\n");
        } else if (head.next == null) {
            int data = head.data;
            head = null;
            return data;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            int data = temp.next.data;
            temp.next = null;
            return data;
        }
    }

    public int deleteAtSpecificPosition(int position) {
        int data = -1;
        Node prev=null;
        Node curr = head;
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        } else if (head.next == null) {
            return this.deleteAtEnd();
        } else {
            if (position == 1) {
                data = head.data;
                head = head.next;
            } else {
                for (int i = 0; i < position - 1; i++) {
                    prev = curr;
                    curr = curr.next;
                }
                if (curr != null) {
                    prev.next = curr.next;
                    data = curr.data;
                }
            }
            return data;
        }
    }

    public void display(){
        Node ptr = head;
        System.out.print("Linkedlist : ");
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }
        System.out.println();
    }


    public int size(){
        int count=0;
        Node ptr = head;
        while(ptr!=null){
            count++;
            ptr = ptr.next;
        }
        return count;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

}
