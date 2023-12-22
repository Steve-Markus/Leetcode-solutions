import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SortArrayByIncreasingFrequency {

  public static void main(String[] args) {
    // read input
    int[] nums = new int[]{1, 1, 2, 2, 2, 3};

    int[] ints = frequencySort(nums);

    System.out.println(Arrays.toString(ints));
  }

  private static int[] frequencySort(int[] nums) {
    // map to hold values
    Map<Integer, Integer> map = new HashMap<>();
    // stream over input and fill map
    Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));
    // stream over map, sort and return result
    return Arrays.stream(nums).boxed()
        .sorted((a, b) -> !Objects.equals(map.get(a), map.get(b)) ? map.get(a) - map.get(b) : b - a)
        .mapToInt(n -> n)
        .toArray();
  }
}
