package CircularLL;

import java.util.Scanner;

public class TestCircularLinkedList {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            CircularLinkedList circularLinkedList = new CircularLinkedList();
            int choice = 0;
            do {
                System.out.println("--- Simple Linked List based operations ---");
                System.out.println("1. Show the contents of Circular linked list.");
                System.out.println("2. Insert the data at the beginning of Circular linked list.");
                System.out.println("3. Insert the data at the end of Circular linked list.");
                System.out.println("4. Insert the data at a specific position in Circular linked list.");
                System.out.println("5. Check how many elements are there in the Circular linked list.");
                System.out.println("6. Check to see if Circular linked list is empty.");
                System.out.println("7. Delete the data at the beginning of Circular linked list.");
                System.out.println("8. Delete the data at the end of Circular linked list.");
                System.out.println("9. Delete the data at a specific position in Circular linked list.");
                System.out.println("0. Exit.");
                System.out.println("Enter your choice : ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        circularLinkedList.display();
                        break;
                    case 2:
                        System.out.println("Enter an Element : ");
                        circularLinkedList.addAtBegin(sc.nextInt());
                        circularLinkedList.display();
                        break;
                    case 3:
                        System.out.println("Enter an Element : ");
                        circularLinkedList.addAtEnd(sc.nextInt());
                        circularLinkedList.display();
                        break;
                    case 4:
                        System.out.println("Enter an Element & position : ");
                        circularLinkedList.addAtSpecificPosition(sc.nextInt(), sc.nextInt());
                        circularLinkedList.display();
                        break;
                    case 5:
                        System.out.println("The current size of the circular queue is : " + circularLinkedList.size());
                        break;
                    case 6:
                        System.out.println("Is empty status : " + circularLinkedList.isEmpty());
                        break;
                    case 7:
                        System.out.println("Removed element : " + circularLinkedList.deleteAtBegin());
                        circularLinkedList.display();
                        break;
                    case 8:
                        System.out.println("Removed element : " + circularLinkedList.deleteAtEnd());
                        circularLinkedList.display();
                        break;
                    case 9:
                    System.out.println("Enter the position of the element to be removed : ");
                    System.out.println(
                            "Removed element : " + circularLinkedList.deleteAtSpecificPosition(sc.nextInt()));
                    circularLinkedList.display();
                        break;
                    case 0:
                        System.out.println("thank you for using our services.");
                        break;
                    default:
                        System.out.println("enter a valid choice...");
                        break;
                }
            } while (choice != 0);
        }
    }
}
