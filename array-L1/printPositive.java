//print positive number
public class printPositive {
    public static void main(String[] args) {
        int[] arr = {2, 6, -5, -1, 0, 4, -9};
        for (int i =0;i<arr.length;i++){
            if(arr[i]>=0){
                System.out.println(arr[i]);
            }
        }
    }
}
