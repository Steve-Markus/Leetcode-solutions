import java.util.Arrays;

public class ConcatenationOfArray {

  public static void main(String[] args) {
    // read input
    int[] nums = {1, 2, 1};
    int[] concatenation = getConcatenation(nums);
    System.out.println(Arrays.toString(concatenation));
  }

  private static int[] getConcatenation(int[] nums) {
    int n = nums.length;
    // create array for result
    int[] result = new int[n * 2];
    // copy array first time
    System.arraycopy(nums, 0, result, 0, n);
    // copy array second time
    System.arraycopy(nums, 0, result, n, n);
    // return result
    return result;
  }
}
