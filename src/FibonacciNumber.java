public class FibonacciNumber {

  public static void main(String[] args) {
    var n = 5;
    int fib = fib(n);
    System.out.println(fib);
  }

  private static int fib(int n) {
    // 1. Declare array for memoization
    var memo = new Integer[n + 1];
    // 2. Starting point of algorithm
    return memoization(n, memo);
  }

  private static int memoization(int n, Integer[] memo) {
    // 3. bottom case
    if (n <= 1) {
      return n;
    }
    // 4. return result if already calculated
    if (memo[n] != null) {
      return memo[n];
    }
    // 5. calculate result with recursion
    return memo[n] = memoization(n - 1, memo) + memoization(n - 2, memo);
  }
}
