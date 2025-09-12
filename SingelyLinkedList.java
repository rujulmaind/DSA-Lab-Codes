//create a linked list where add node at first, at last, delete at first, delete at last, find the size of linked list and reverse the linked list


package test;
import java.util.*;
class SingelyLinkedList {
    
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
    	Scanner in=new Scanner(System.in);
        SingelyLinkedList list = new SingelyLinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        System.out.println("Size: " + list.getSize());

        list.reverse();
        list.display();
    }
}

