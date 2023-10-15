import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int i = arrayPairSum(nums);
        System.out.println(i);
    }

    public static int arrayPairSum(int[] nums) {
        // 1. Sort array asc
        Arrays.sort(nums);
        // 2. Declare variable to hold sum
        int sum = 0;
        // 3. Iterate over elements with two steps each time
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        // 4. return sum
        return sum;
    }
}
