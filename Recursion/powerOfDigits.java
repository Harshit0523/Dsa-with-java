// the question is finde the power of number

import java.util.Scanner;

public class powerOfDigits {
    // first appraoch to find the power of number given bt user
    static int power(int p , int q){
        if(q==0) return 1; // base work
        return power(p,q-1) * p; // self work and recursive work
    }

    // this is second approach to solve thi problem
    static int pow(int p, int q) {
          // base work
        if (q == 0) return 1;
        int sum = pow(p,q/2);
        if (q % 2 == 0) {   // if q is sum
            return sum * sum ;   // self work
        }
          return p * sum *sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. pls");
        // take input by user
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(power(p,q));  // call first function and print the result
        System.out.println(pow(p,q));    // call second function and print the result
    }
}
