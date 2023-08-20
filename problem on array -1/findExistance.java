import java.util.Scanner;

// question-1 find if there a exists a pair in the array
public class
findExistance {
    public static void findExist(int [] arr,int x){
        int n = arr.length;
//        boolean ans = true;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
               if( arr[j] - arr[i] == x){
                   System.out.println("yes");
                   return;
               }
            }
        }
        System.out.println("no");
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
        System.out.println("enter no.");
        int a = sc.nextInt();
        findExist(arr,a);
    }
}
