import java.util.Scanner;
public class inplace {
    public static void printarray(int [][] arr,int r,int c){
        for (int i =0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //brute force method
    public static void inplace(int [][]arr,int r,int c){
        int [][] ans = new int[c][r];
        for (int i=0;i< c;i++){
            for (int j=0;j<r;j++){
                ans[i][j] = arr[j][i];
            }
        }
        printarray(ans,c,r);
    }
    public static void inplace2(int [][] arr,int r,int c){
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printarray(arr,r,c);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("enter r1,c1 ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] a = new int[r][c];
        System.out.println("enter the first matrix");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
//       inplace(a,r,c); //using extra space
       inplace2(a,r,c); //using swaping method


    }
}
