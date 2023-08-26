import java.util.Scanner;

public class factorial {

    //find factorials of given no.
    static int fact(int n){
        if (n==0) return 1;

        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        System.out.println(fact(n)); // call factorial function
    }
}
