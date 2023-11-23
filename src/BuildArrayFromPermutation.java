import java.util.Arrays;

public class BuildArrayFromPermutation {

  public static void main(String[] args) {
    // read input
    int[] nums = {0, 2, 1, 5, 3, 4};
    int[] ints = buildArray(nums);
    System.out.println(Arrays.toString(ints));
  }

  private static int[] buildArray(int[] nums) {
    // create array with same length
    int[] ans = new int[nums.length];
    // iterate over elements
    for (int i = 0; i < nums.length; i++) {
      // set element
      ans[i] = nums[nums[i]];
    }
    // return result
    return ans;
  }
}
