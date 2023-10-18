import java.util.Arrays;

public class ClimbingStairs {

  public static void main(String[] args) {
    int n = 15;
    int i = climbStairs(n);
    System.out.println(i);
  }

  private static int climbStairs(int n) {
    // 1. array for memoization
    int[] dp = new int[n + 1];
    // 2. fill array with -1
    Arrays.fill(dp, -1);
    // 3. start recursion
    return calculate(n, dp);
  }

  private static int calculate(int n, int[] dp) {
    // 4. bottom cases
    if (n == 0 || n == 1) {
      return 1;
    }
    if (dp[n] != -1) {
      return dp[n];
    }
    // 5. calculate result
    return dp[n] = calculate(n - 1, dp) + calculate(n - 2, dp);
  }
}
