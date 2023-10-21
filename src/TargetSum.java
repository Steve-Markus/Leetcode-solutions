public class TargetSum {

  public static void main(String[] args) {
    // input data
    int[] nums = {1, 1, 1, 1, 1};
    var target = 3;
    int result = findTargetSumWays(nums, target);
    System.out.println(result);
  }

  private static int findTargetSumWays(int[] nums, int target) {
    // 1. Starting point of algorithm
    return solution(0, 0, nums, target);
  }

  private static int solution(int i, int currentSum, int[] nums, int target) {
    // 2. Base cases
    if (i == nums.length) {
      if (currentSum == target) {
        return 1;
      }
      return 0;
    }
    // 3. Try to calculate possible ways with addition
    int possibleWaysWithAddition =
        solution(i + 1, currentSum + nums[i], nums, target);
    // 4. Try to calculate possible ways with subtraction
    int possibleWaysWithSubtraction =
        solution(i + 1, currentSum - nums[i], nums, target);
    // 5. return result
    return possibleWaysWithAddition + possibleWaysWithSubtraction;
  }
}
