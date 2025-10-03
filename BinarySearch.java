package test;
import java.lang.*;
import java.util.*;
class BinarySearch {

    static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;

            if (key == arr[mid]) {
                return mid;  
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;  
    }

    public static void main(String[] args) {
        int[] Sortedarray = {5, 7, 10, 12, 20, 30, 45};
        int keyvalue = 30;

        int result = binarySearch(Sortedarray, keyvalue);

        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at the index: " + result);
        }
    }
}

