import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {
    // read input
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = twoSum(nums, target);
    System.out.println(Arrays.toString(result));
  }

  private static int[] twoSum(int[] nums, int target) {
    // Map to hold values
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      // diff between two nums
      int diff = target - nums[i];

      if (map.containsKey(diff)) {
        // if sum is found -> return result
        return new int[]{map.get(diff), i};
      }

      map.put(nums[i], i);
    }
    return new int[0];
  }
}
