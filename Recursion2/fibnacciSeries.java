import java.util.Scanner;

public class fibnacciSeries {



    // find fibo4
    // /*-nacci no.
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(fib(i)); //call fibonacci function
        }
    }
}
