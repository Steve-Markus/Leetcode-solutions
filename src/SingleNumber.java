import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

  public static void main(String[] args) {
    // input
    int[] nums = new int[]{2, 2, 1};

    int i = singleNumber(nums);
    System.out.println(i);
  }

  private static int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (var i : nums) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }

    for (var a : nums) {
      if (map.get(a) == 1) {
        return a;
      }
    }
    return 0;
  }

  //     int a = 0;
  //    for (int i = 0; i < nums.length; i++) {
  //      a ^= nums[i];
  //    }
  //    return a;

  //  Arrays.sort(nums);
  //    if (nums.length == 1) {
  //      return nums[0];
  //    }
  //    for (int i = 0; i < nums.length - 1; i += 2) {
  //      if (nums[i] != nums[i + 1]) {
  //        return nums[i];
  //      }
  //    }
  //    return nums[nums.length - 1];
}
