package test;

class BS {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class IS {
    public static void insertionSort(int[] arr1) {
        int n = arr1.length;
        for (int i = 1; i < n; i++) {
            int key = arr1[i];
            int j = i - 1;
            while (j >= 0 && arr1[j] > key) {
                arr1[j + 1] = arr1[j];
                j--;
            }
            arr1[j + 1] = key;
        }
    }
}

class SS {
    public static void selectionSort(int[] arr2) {
        int n = arr2.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr2[j] < arr2[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr2[minIndex];
            arr2[minIndex] = arr2[i];
            arr2[i] = temp;
        }
    }
}

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        BS.bubbleSort(arr);
        System.out.print("Bubble Sort: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        int[] arr1 = {1, 5, 3, 2, 6, 4};
        IS.insertionSort(arr1);
        System.out.print("Insertion Sort: ");
        for (int num1 : arr1) System.out.print(num1 + " ");
        System.out.println();

        int[] arr2 = {5, 6, 2, 4, 1, 3};
        SS.selectionSort(arr2);
        System.out.print("Selection Sort: ");
        for (int num2 : arr2) System.out.print(num2 + " ");
        System.out.println();
    }
}
