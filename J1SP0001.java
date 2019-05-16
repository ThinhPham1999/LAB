/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0001;

import java.util.Scanner;

/**
 *
 * @author Thinh
 */
public class J1SP0001 {

    /**
     * @param args the command line arguments
     */
    private static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = inputSizeOfArray();
        int[] a = inputValueOfArray(n);
        sortArrayBubbleSort(a);
        print(a);
    }
    
    private static int checkInput(){
        while(true){
            try{
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            }catch(NumberFormatException e){
                System.err.println("Please input number: ");
                System.out.print("Enter again: ");
            }
        }
    }
    
    private static int inputSizeOfArray(){
        System.out.print("Enter of array: ");
        int n = checkInput();
        return n;
    }
    
    private static int[] inputValueOfArray(int n){
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter a[" + i + "] = ");
            a[i] = checkInput();
        }
        return a;
    }
    
    private static void sortArrayBubbleSort(int[] a){
        System.out.println("Unsort Array:");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length - i - 1; j++){
                if (a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println("");
    }
    
    private static void print(int[] a){
        System.out.println("Sorted array");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
