package j1.s.p0006;

import java.util.Random;
import java.util.Scanner;

public class J1SP0006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, value;

        System.out.print("Length of array: ");
        length = sc.nextInt();
        int[] arr = new int[length];
        int[] index = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = new Random().nextInt(length * 10);
            index[i] = i;
        }
        displayArray(arr);
        bubbleSort(arr, index);
        //displayArray(arr);
        System.out.print("Insert the value: ");
        value = sc.nextInt();
        int result = binarySearch(arr, index, value, 0, length - 1);
        if (result == -1) {
            System.out.println("Not found.");
        } else {
            System.out.println("Index: " + result);
        }
    }
    
    /*
        Print array
    */
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void bubbleSort(int[] arr, int[] index) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] = getItself(arr[i + 1], arr[i + 1] = arr[i]);
                    index[i] = getItself(index[i + 1], index[i + 1] = index[i]);
                    swapped = true;
                }
            }
        }
    }

    public static int binarySearch(int[] arr, int[] index, int value, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (value == arr[middle]) {
            return index[middle];
        }
        if (value < arr[middle]) {
            return binarySearch(arr, index, value, left, middle - 1);
        } else {
            return binarySearch(arr, index, value, middle + 1, right);
        }

    }

    /*
        Swap trick
     */
    public static int getItself(int itself, int dummy) {
        return itself;
    }
}
