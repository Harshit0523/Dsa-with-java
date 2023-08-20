//find smallest no. in array using standard libarary
import java.util.Arrays;

public class findSmallNo {
    public static void main(String[] args) {
        int[] arr = {2, -3, 5, 8, 1, 0, -4};
        Arrays.sort(arr);
        System.out.println("the smallest no."+arr[0]);
    }
}
