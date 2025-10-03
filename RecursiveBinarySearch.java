package test;
import java.lang.*;
import java.util.*;

class RecursiveBinarySearch {
    static int binarySearch(int[] arr, int left, int right, int key) {
        if (left > right) {
            return -1;  
        }

        int mid = (left + right) / 2;

        if (arr[mid] == key) {
            return mid;  
        } else if (key < arr[mid]) {
            return binarySearch(arr, left, mid - 1, key);  
        } else {
            return binarySearch(arr, mid + 1, right, key); 
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 10, 12, 20, 30, 45};
        int key = 30;

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
