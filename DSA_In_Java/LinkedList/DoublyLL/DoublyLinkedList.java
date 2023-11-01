package DoublyLL;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private static class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    private Node head;
    public DoublyLinkedList(){
        this.head=null;
    }
    public void addAtBegin(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
        }else{
            newNode.next = head;
            head.prev=newNode;
            head = newNode;
        }
    }
    public void addAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head= newNode;
        }else{
            Node last = head;
            while (last.next!=null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
        }
    }

    public void addAtSpecificPosition(int data,int position){
        Node newNode = new Node(data);
        if(position==0){
            newNode.next =head;
            head.prev = newNode;
            head = newNode;
        }else if (position>0){
            Node temp = head;
            for(int i=0;i<position -1;i++){
                temp = temp.next;
            }
            if(temp!=null){
                newNode.next = temp.next;
                newNode.prev=temp;
                newNode.next.prev=newNode;
                temp.next=newNode;
            }
        }
    }

    public int deleteAtBegin(){
        if(head ==null){
            throw new NoSuchElementException("List is empty.\n");
        }else{
            int data = head.data;
            head = head.next;
            head.prev=null;
            return data;
        }
    }

    public int deleteAtEnd(){
         if(head ==null){
            throw new NoSuchElementException("List is empty.\n");
        }else if(head.next==null){
            int data = head.data;
            head = null;
            return data;
        }else{
           Node last =head;
           while(last.next.next!=null){
            last = last.next;
           }
           int data = last.next.data;
           last.next=null;
           return data;
        }
    }

    public int deleteAtSpecificPosition(int position){
        int data =-1;
        Node curr=head;
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        } else if (head.next == null) {
            data = head.data;
            head = null;
            return data;
        }else{
            if(position==1){
                data = head.data;
                head = head.next;
                head.prev = null;
            }else{
            for(int i=0;i<position-1;i++){
                curr=curr.next;
            }
            if(curr.next!=null){
                data = curr.data;
              curr.prev.next = curr.next;
              curr.next.prev = curr.prev;
            }else{
                data = curr.data;
            // curr.prev.next = curr.next;
             curr.prev.next = null;
            }
        }
        return data;
    }
    }

    public void display() {
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
