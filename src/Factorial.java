public class Factorial {

  public static void main(String[] args) {
    System.out.println(solution(5));
  }

  private static long solution(int n) {
    return n == 1 ? 1 : n * solution(n - 1);
  }
}
