package test;
import java.util.*;

public class Queue1 {
    public final int max = 4;
    public int[] arr = new int[max];
    public int rear = -1;
    public int front = -1; 

    public void Enqueue(int data) {
        if (rear == max - 1) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) { 
            front = 0;
        }
        rear++;
        arr[rear] = data;
        System.out.println("Enqueue: " + data);
    }

    public void Dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Underflow");
            return;
        }
        int deletedata = arr[front];
        front++;
        System.out.println("Dequeue: " + deletedata);

        
        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    public void printQueue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: [");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i]);
            if (i < rear) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50); 
        q.printQueue();
        q.Dequeue();
        q.Dequeue();
        q.printQueue();
    }
}
