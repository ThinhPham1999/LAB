/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0004;

import java.util.Random;
import java.util.Scanner;

/*
 *
 * @author Thinh
 */
public class J1SP0004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        int length = s.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Random().nextInt(length*10);
        }

        J1SP0004 sorted = new J1SP0004();

        System.out.print("Unsorted array: ");
        sorted.print(array);
        System.out.println();
        sorted.quickSort(array, 0, length - 1);
        System.out.println("\nSorted array");
        sorted.print(array);
    }

    void print(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    int partition(int arr[], int left, int right) {
        int i = left;
        int j = right;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            };
            while (arr[j] > pivot) {
                j--;
            };

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    void quickSort(int[] arr, int left, int right) {

        int index = partition(arr, left, right);

        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }

    }
}
