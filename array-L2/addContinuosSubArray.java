import java.util.Scanner;

// find continguous sub array which adds to given number s
public class addContinuosSubArray {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("give target sum");
        int S = sc.nextInt();
            int i = 0;
            int j = 0;
            int sum = 0;
        while(j<n){
            sum += arr[j];
            if (sum>S){
                while (sum>S && i<j){
                    sum -= arr[i];
                    i++;
                }
            }
            if(sum == S){
                System.out.print(i+1 + " ");
                System.out.print(j+1);
                break;
            }
            j++;
        }
    }

}
