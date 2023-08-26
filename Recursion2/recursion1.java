import java.util.Scanner;

public class recursion1 {

    //print increasing order
    public static void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    //print decreasing order
    public static void Rverseprint(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Rverseprint(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("incresing order");
        print(n);
        System.out.println("decreasin order");
        Rverseprint(n);
    }
}
