import java.util.Scanner;class Solution {
    public int[] twoSum(int[] nums, int target) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int [] arr2 = new int[2];
        System.out.println("enter the target");
         target = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    arr2[0] = i;
                    arr2[1] = j;
                    break;
                }
            }
        }
        return arr2 ;
    }
}