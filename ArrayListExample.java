package test;
import java.util.*;


public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the ArrayList: ");
        int size = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int element = sc.nextInt();
            list.add(element);
        }

        System.out.println("\nThe ArrayList elements are: " + list);

        if (size >= 4) {
            System.out.println("Element at 4th position: " + list.get(3));
        } else {
            System.out.println("The list has less than 4 elements. Cannot display 4th position.");
        }

        sc.close();
    }
}
