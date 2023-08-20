import java.util.Scanner;

//check is given array dividation into two parts are possible or not .?
public class preeqsuff {
    public static int totalsum(int [] arr){
        int totalsum = 0;
        for (int i = 0;i<arr.length;i++){
            totalsum += arr[i];
        }
        return totalsum;
    }
    public static boolean check(int[] arr) {
         int totalsum = totalsum(arr);
        int presum = 0;
        int suffsum = 0;
        for (int i=0;i<arr.length;i++){
            presum += arr[0];
            suffsum = totalsum - presum;
            if (presum == suffsum){
               return true ;
            }
        }
        return false;
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
        System.out.println(check(arr));
    }
}
