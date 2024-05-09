import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {

  public static void main(String[] args) {
    // read input
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    System.out.println(Arrays.toString(intersect(nums1, nums2)));
  }

  private static int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();

    // count occurrences of each number in nums1
    for (var num : nums1) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    List<Integer> intersection = new ArrayList<>();

    // check occurrences of each number in nums2 and add to intersection
    for (int num : nums2) {
      if (map.containsKey(num) && map.get(num) > 0) {
        intersection.add(num);
        map.put(num, map.get(num) - 1);
      }
    }

    // convert List to Array
    int[] result = new int[intersection.size()];
    for (int i = 0; i < intersection.size(); i++) {
      result[i] = intersection.get(i);
    }

    return result;
  }
}
