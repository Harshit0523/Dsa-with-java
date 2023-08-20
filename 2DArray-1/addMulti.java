import java.util.Scanner;
public class addMulti {
    public static void printarray(int [][] arr,int r,int c){
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    // adition method
    public static void add(int [][] a, int [][] b,int r1, int c1,int r2, int c2){
        if (r1 != r2 && c1 != c2) {
            System.out.println("please enter valid array");
            return;

        }

        int [][] sum = new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("sum of matrix");
        printarray(sum,r1,c2);
    }

    // multipication method
    public static void multi(int [][] a, int [][] b,int r1, int c1,int r2, int c2){
        if(c1!=r2){
            System.out.println("multipication not possible, because c1 not equal to r2");
            return;
        }
        int [][] multi = new int [r1][c2];
        for (int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for (int k = 0;k<c1;k++){
                    multi[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("multipication of matrix");
        printarray(multi,r1,c2);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("enter r1,c1 ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] a = new int[r1][c1];
        System.out.println("enter the first matrix");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter r2,c2 ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][] b = new int[r2][c2];
        System.out.println("enter the second matrix");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("first matrix");
        printarray(a,r1,c1);
        System.out.println("second matrix");
        printarray(b,r2,c2);
//        add(a,b,r1,c1,r2,c2);
        multi(a,b,r1,c1,r2,c2);
    }
}
