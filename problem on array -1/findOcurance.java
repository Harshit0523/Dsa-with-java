import java.util.Scanner;

public class findOcurance {
    public static int findOcurance(int [] arr, int x ){
        int n = arr.length;
        int count = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
        }
        return count;
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
        System.out.println(findOcurance(arr , a));
    }
}
