import java.util.Scanner;

public class giveFindPreSum {

    //    find prefirx sum with given index -- brute force method
    public static int givenPreFixSum(int [] arr,int l , int r){
        int sum = 0;
        for (int i =l ; i<=r;i++){
            sum += arr[i];
        }
        return sum;
    }

    // find prefixsum with given array
    public static void givenPreFixSum2(int [] arr){
        for (int i=1;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i];
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
        System.out.println("enter imdex");
        int l = sc.nextInt();
        int r = sc.nextInt();
//        System.out.println( givenPreFixSum(arr,l,r));
        givenPreFixSum2(arr);
        int sum = arr[r] - arr[l - 1];
        System.out.println(sum);
    }
}
