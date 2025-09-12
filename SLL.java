package test;
import java.util.*;

class SLL {
    
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private int size = 0;

    
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        size--;
    }

    
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
    }

    
    public int getSize() {
        return size;
    }

    
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SLL list = new SLL();
        int choice, value;

        while (true) {
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at Last");
            System.out.println("3. Delete from Beginning");
            System.out.println("4. Delete from Last");
            System.out.println("5. Display List");
            System.out.println("6. Get Size");
            System.out.println("7. Reverse List");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = in.nextInt();
                    list.addFirst(value);
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    value = in.nextInt();
                    list.addLast(value);
                    break;
                case 3:
                    list.deleteFirst();
                    break;
                case 4:
                    list.deleteLast();
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Size of list: " + list.getSize());
                    break;
                case 7:
                    list.reverse();
                    System.out.println("List reversed.");
                    break;
                case 8:
                    System.out.println("Exiting...");
                    in.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

