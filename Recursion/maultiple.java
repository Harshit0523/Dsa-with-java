import java.util.Scanner;

public class maultiple {
    static void printMultiple(int n , int k){
        if(k==0) { // base work to stop loop
            return;
        }
        printMultiple(n,k-1); // recursive work
        System.out.println(n*k); // self work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printMultiple(n,k);
    }
}
