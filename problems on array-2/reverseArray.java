import java.util.Scanner;
public class reverseArray {
    public static void swap(int [] arr , int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int [] arr){
        int i =0;
        int j= arr.length-1;
        while(i<j){
            swap(arr,i ,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter array size ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
