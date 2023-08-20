//find no. who not paird
import java.util.Scanner;
public class findUnique {
    public static void findUnique(int[] arr) {
           for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findUnique(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
                return ;
            }
        }
    }
}
