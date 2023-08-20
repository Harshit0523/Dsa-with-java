import java.util.Scanner;
public class rotateArray {
    public static int[] rotatearray(int[] arr, int k) {
        int n =  arr.length;
        int[] ans = new int[n];
        k %= n;
        int j=0;
        for (int i=n-k;i<n;i++){
            ans[j++] = arr[i];
        }for (int i=0;i<n-k-1;i++){
            ans[j++] = arr[i];
        }
        return ans;
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
        int k = sc.nextInt();
        int [] ans = rotatearray(arr, k);
        for (int i=0;i<n;i++){
            System.out.print(ans[i]);
        }
    }
}
