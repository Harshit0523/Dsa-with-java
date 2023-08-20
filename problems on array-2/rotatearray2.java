import java.util.Scanner;

public class rotatearray2 {

    public static void reversarray(int [] arr,int i, int j){
        while(i<j){
            swap (arr , i,j);
            i++;
            j--;
        }
    }
    public static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        System.out.println("enter k");
        int  k = sc.nextInt();
        k %= n;

        reversarray(arr, n-k, n-1);
        reversarray(arr,0 ,n-k-1);
        reversarray(arr,0 ,n-1);
        for (int i = 0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
