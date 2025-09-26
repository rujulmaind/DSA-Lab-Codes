package test;
import java.util.Scanner;

class LinearSearch1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the key to search: ");
        int key = in.nextInt();

        int index = -1;
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
              if (index != -1)
            System.out.println("Key:-" + key + " found at index:-" + index);
        else
            System.out.println("Key:-" + key + " not found");
    }
}
