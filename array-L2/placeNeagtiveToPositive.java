//1.place positive to negative
import java.util.Scanner;
public class placeNeagtiveToPositive {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter array");
        for (int i=0;i<n;i++){
            arr[i]  =  sc.nextInt();
        }
        int [] ans = new int[n];
        int x = 0;
        for (int i=0;i<n;i++){
            if (arr[i]>=0){
                ans[x] = arr[i];
                x++;
            }
        }
        for (int i = 0 ; i<n;i++){
            if (arr[i]<0){
                ans[x] = arr[i];
                x++;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
