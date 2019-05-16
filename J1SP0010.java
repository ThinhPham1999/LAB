
package j1.s.p0010;

import java.util.Random;
import java.util.Scanner;

public class J1SP0010 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of array: ");
        int length = sc.nextInt();
        
        System.out.println("Enter search value");
        int search = sc.nextInt();
        
        int[] arr = new int[length];
        for (int i = 0; i < length; i++){
            arr[i] = new Random().nextInt(length * 10);
        }
        
        J1SP0010 find = new J1SP0010();
        int result = find.linerSearch(arr, search);
        find.display(arr, result);
    }
    
    public void display(int[] arr, int index){
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        if (index  == -1) {
            System.out.println("Not found.");
        }else
        {
            System.out.println("[" + index + "]");
        }
    }
    
    public int linerSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++){
            if (key == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
