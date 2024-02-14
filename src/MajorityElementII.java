import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

  public static void main(String[] args) {
    // read input
    int[] nums = {3, 2, 3};
    List<Integer> result = majorityElement(nums);
    result.forEach(e -> System.out.print(e + " "));
  }

  private static List<Integer> majorityElement(int[] nums) {
    List<Integer> result = new ArrayList<>();
    // base nums
    int elementOne = 0;
    int elementTwo = 0;
    // base count
    int countOne = 0;
    int countTwo = 0;

    for (int num : nums) {
      if (num == elementOne) {
        // increase
        countOne++;
      } else if (num == elementTwo) {
        // increase
        countTwo++;
      } else if (countOne == 0) {
        // select new num
        elementOne = num;
        countOne = 1;
      } else if (countTwo == 0) {
        // select new num
        elementTwo = num;
        countTwo = 1;
      } else {
        // decrease
        countOne--;
        countTwo--;
      }
    }

    // verify
    countOne = countTwo = 0;
    for (int num : nums) {
      if (num == elementOne) {
        countOne++;
      } else if (num == elementTwo) {
        countTwo++;
      }
    }

    // add elements to result
    if (countOne > nums.length / 3) {
      result.add(elementOne);
    }
    if (countTwo > nums.length / 3) {
      result.add(elementTwo);
    }

    return result;
  }
}
