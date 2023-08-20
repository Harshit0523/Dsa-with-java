import javax.swing.*;
import java.util.Scanner;

public class findSufSum {
    public static void suffixSum(int [] arr){
        for (int i=2;i<=arr.length;i++){
            arr[arr.length-i] += arr[arr.length-i+1];
        }
    }
    public static void printarray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        suffixSum(arr);
        printarray(arr);
    }
}
