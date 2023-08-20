import java.util.Scanner;

// check equality two array
public class checkEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        boolean ans = true;
        for (int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
            if(arr2[i] != arr[i]){
                ans = false;
                break;
            }

        }
        System.out.println(ans);
    }
}
