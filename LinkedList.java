package test;

import java.util.Scanner;

class Nodes {
    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Nodes head;

    public void add(int data) {
        Nodes newNode = new Nodes(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Nodes current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtPosition(int data, int position) {
        Nodes newNode = new Nodes(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Nodes current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Nodes current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value " + value + " not found.");
        } else {
            current.next = current.next.next;
        }
    }

    public void printList() {
        Nodes current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner in = new Scanner(System.in);

       
        System.out.print("Enter the number of initial elements to add: ");
        int n = in.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int data = in.nextInt();
            list.add(data);
        }
        list.printList();

        
        while (true) {
            System.out.print("Do you want to insert a value? (yes/no): ");
            String ans = in.next().toLowerCase();
            if (!ans.equals("yes")) break;

            System.out.print("Enter value to insert: ");
            int insertValue = in.nextInt();
            System.out.print("Enter position to insert at: ");
            int position = in.nextInt();
            list.insertAtPosition(insertValue, position);
            list.printList();
        }

        
        while (true) {
            System.out.print("Do you want to delete a value? (yes/no): ");
            String ans = in.next().toLowerCase();
            if (!ans.equals("yes")) break;

            System.out.print("Enter value to delete: ");
            int deleteValue = in.nextInt();
            list.deleteByValue(deleteValue);
            list.printList();
        }

        
        System.out.println("\nFinal Linked List:");
        list.printList();

        in.close();
    }
}