import java.util.Scanner;

public class findPreSum {


    //find prefixSum with brute force method
    public static int [] preFixSum(int [] arr){
        int[] array = new int[arr.length];
        array[0] = arr[0];
        for (int i =1;i<arr.length;i++){
//            array[i] = arr[i-1] + arr[i];
            array[i] = array[i-1] + arr[i];
        }
        return array;
    }
    public static void printarray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //find prefix sum with no space
    public static void preFixSum2(int [] arr){
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
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//         int [] arr1 = preFixSum(arr);

        preFixSum2(arr);
        printarray(arr);
    }

}
