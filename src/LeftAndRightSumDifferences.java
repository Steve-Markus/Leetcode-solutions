import java.util.Arrays;

public class LeftAndRightSumDifferences {

  public static void main(String[] args) {
    // read input
    int[] nums = {10, 4, 8, 3};
    int[] ints = leftRightDifference(nums);
    System.out.println(Arrays.toString(ints));
  }

  private static int[] leftRightDifference(int[] nums) {
    int result = 0;
    int l = nums.length;
    int[] ans = new int[l];

    // iterate over elements and sum it
    for (int i = 0; i < l; i++) {
      ans[i] = result;
      result += nums[i];
    }

    result = 0;
    // iterate over elements and calculate result
    for (int i = l - 1; i >= 0; i--) {
      ans[i] = Math.abs(ans[i] - result);
      result += nums[i];
    }
    // return result
    return ans;
  }
}
