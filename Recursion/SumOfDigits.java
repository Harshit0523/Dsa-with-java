import java.util.Scanner;
public class sumOfDigits {
     static int suM(int a){
        if(a>=0 && a<=9) return a ; // Base Work
         return suM(a/10) + a%10; //recursive work and self work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digits for sum");
        int a = sc.nextInt();
        System.out.println(suM(a)); // calling function and print sum of digits
    }
}
