import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayFormOfInteger {

  public static void main(String[] args) {
    // read input
    int[] num = {1, 2, 0, 0};
    int k = 34;
    List<Integer> list = addToArrayForm(num, k);
    list.forEach(e -> System.out.print(e + " "));
  }

  private static List<Integer> addToArrayForm(int[] num, int k) {
    // 1. variable to hold nums
    var sb = new StringBuilder();
    // 2. read nums from array
    Arrays.stream(num).forEach(sb::append);
    // 3. add the nums with the new ones
    var nums = new BigInteger(sb.toString());
    var addNums = new BigInteger(String.valueOf(k));
    var res = String.valueOf(nums.add(addNums));
    // 4. collect all nums to list
    var result = new ArrayList<Integer>();
    for (int i = 0; i < res.length(); i++) {
      char c = res.charAt(i);
      result.add(c - 48);
    }
    // 5. return result
    return result;
  }

}
