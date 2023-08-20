import java.util.Scanner;

public class rotation {
    public static void printarray(int [][] arr,int r,int c){
        for (int i =0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void inplace2(int [][] arr,int r,int c){
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void reverse(int [] matrix){
        int i = 0;
        int j=  matrix.length;
       while (i<j){
           int temp = matrix[i];
           matrix [i] = matrix[j];
           matrix[j] = temp;
           i++;
           j--;
       }
    }
    public static void rotate(int [][] matrix,int m,int n){
        inplace2(matrix, m, n);
        for (int i = 0 ;i<m;i++){
            reverse(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r1,c1 ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] a = new int[r][c];
        System.out.println("enter the matrix");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        rotate(a, r, c);
        printarray(a,r,c);
    }
}
