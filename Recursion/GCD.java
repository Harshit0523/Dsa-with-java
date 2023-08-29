import java.util.Scanner;

//the problem is find GCD and GCD means find Greater common diviser
public class GCD {

    //Approach1 -this is first approach to find gcd using loop
    static int igcd(int x , int y){
        while(x%y!=0){
            int rem = x%y;
            x=y;
             y = rem;
        }
        return y;
    }

    //Approach2 - Euclid Method - this is second menthod to find gcd using recursion
    static int gcd(int x, int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(igcd(a,b));
        System.out.println(gcd(a,b));
    }
}
