import java.util.Scanner;

//question-3 find missing no.
public class findMissinf {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter array size ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if(Math.abs(arr[i])-1==n){
                continue;
            }
            int index = Math.abs(arr[i]) - 1;
            arr[index] *= -1;
        }
        int ans = 0;
        for (int i=0;i<n;i++){
            if(arr[i]>0){
                ans = i+1;
                System.out.println(ans);
                return;
            }
        }
    }
}
