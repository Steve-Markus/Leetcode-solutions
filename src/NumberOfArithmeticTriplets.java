import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {

  public static void main(String[] args) {
    // read input
    int[] nums = new int[]{0, 1, 4, 6, 7, 10};
    int diff = 3;
    int i = arithmeticTriplets(nums, diff);
    System.out.println(i);
  }

  private static int arithmeticTriplets(int[] nums, int diff) {
    // base case
    if (nums.length < 3) {
      return 0;
    }
    // variable to hold result
    int count = 0;
    Set<Integer> values = new HashSet<>();
    for (var num : nums) {
      // if true increment result
      if (values.contains(num - diff) && values.contains(num - diff * 2)) {
        count++;
      }
      values.add(num);
    }
    // return result
    return count;
  }
}
