import java.util.Arrays;
import java.util.Scanner;

public class findmiss2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0;i<n;i++){
            if(arr[i]== i){
                System.out.println(arr[i]);
                System.out.println(i+1);
                return ;
            }
        }
    }
}
