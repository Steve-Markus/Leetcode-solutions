public class SumOfSquaresOfSpecialElements {

  public static void main(String[] args) {
    // read input
    int[] nums = {1, 2, 3, 4};
    int i = sumOfSquares(nums);
    System.out.println(i);
  }

  private static int sumOfSquares(int[] nums) {
    // variable to hold sum
    int sum = 0;
    int length = nums.length;
    // iterate over elements
    for (int i = 0; i < length; i++) {
      if (length % (i + 1) == 0) {
        // sum elements
        sum += nums[i] * nums[i];
      }
    }
    // return result
    return sum;
  }
}
