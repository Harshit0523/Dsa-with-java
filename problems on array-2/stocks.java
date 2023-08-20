import java.util.Scanner;

public class stocks {
    public static int findprofit(int [] nums){
        int profit = 0;
        int j= Integer.MAX_VALUE;
        int k = Integer.MIN_VALUE;
        int l = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]<j){
                j = nums[i]; //small value index
                l = i;
            }

        }
        for (int i=l;i<nums.length;i++){
                if(nums[i]>k){
                    k = nums[i]; // big value index
//                    System.out.println(k);
                }
        }

        if(j<k){
            profit = k-j;
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter array size ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findprofit(arr));
    }
}
