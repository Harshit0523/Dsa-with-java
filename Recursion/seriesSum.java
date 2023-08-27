import java.util.Scanner;

public class seriesSum {
    static  int seriesSum1(int n){
        if(n==0) return 0;
        return seriesSum1(n-1)+n;
    }
    static  int seriesSum2(int n){
        if(n==0) return 0;
        if(n%2==0){
            return seriesSum2(n-1) -n;
        } else {
            return seriesSum2(n-1) +n;
        }

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(seriesSum2(n));
    }
}
