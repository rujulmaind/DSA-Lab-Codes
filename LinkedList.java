package test;
import java.util.*;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete at position
    public void delete(int position) {
        if (head == null) return;

        Node temp = head;

        if (position == 1) {
            head = temp.next;
            return;
        }

        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) return;

        temp.next = temp.next.next;
    }

    // Print linked list
    public void printList() {
        Node currNode = head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements to insert: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = sc.nextInt();
            list.insert(value);
        }

        list.printList();

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();
        list.delete(pos);
        System.out.print("List after deletion of " + pos + "th element: ");
        list.printList();

        System.out.print("Enter element to insert at beginning: ");
        int newVal = sc.nextInt();
        list.insertAtBeginning(newVal);
        System.out.print("List after insertion at beginning: ");
        list.printList();

        sc.close();
    }
}