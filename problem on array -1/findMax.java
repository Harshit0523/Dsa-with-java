//find maximum using integer min value
import java.util.Scanner;
public class findMax {
    public static int findmax(int [] arr){
        int n =arr.length;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int findsecondmax(int [] arr){
        int max = findmax(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        max =findmax(arr);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter array size ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array");
        for (int i =0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("this is largest no.");
        System.out.println(findsecondmax(arr));
    }
}
