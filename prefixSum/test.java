import java.util.Arrays;
import java.util.Scanner;

public class test {
        public static int singleNumber(int[] nums) {
            Arrays.sort(nums);
            if(nums.length==1){
                return nums[0];
            }
            for(int i=0;i<nums.length-1;i+=2){
//                System.out.print(i);
                if(nums[i]!=nums[i+1]){
                    System.out.println(i);
                    return nums[i];
                }
            }
            return nums[nums.length-1];
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNumber(arr));

    }
}
