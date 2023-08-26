import java.util.Scanner;

public class noOFDigitts {
    static int totalno(int a ){
        if(a>=0 && a<= 9) return 1; //base work
        return totalno(a/10) + 1; // self work and recursive work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(totalno(n)); // function and print no. of didgits using recursion

    }
}
