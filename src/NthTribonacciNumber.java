public class NthTribonacciNumber {

  public static void main(String[] args) {
    // input
    var n = 4;
    int tribonacci = tribonacci(n);
    System.out.println(tribonacci);
  }

  private static int tribonacci(int n) {
    // base case
    if (n == 0) {
      return 0;
    }
    if (n == 1 || n == 2) {
      return 1;
    }

    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 1;
    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    }
    return dp[n];
  }
}
