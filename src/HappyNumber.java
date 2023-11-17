import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

  public static void main(String[] args) {
    // read input
    int n = 19;
    boolean happy = isHappy(n);
    System.out.println(happy);
  }

  private static boolean isHappy(int n) {
    // set to hold values
    Set<Integer> v = new HashSet<>();
    // while num > 1 test num
    while (n != 1 && !v.contains(n)) {
      v.add(n);
      n = test(n);
    }
    // return result
    return n == 1;
  }

  private static int test(int n) {
    // calculate till reduce n
    int t = 0;
    while (n > 0) {
      int d = n % 10;
      n = n / 10;
      t += d * d;
    }
    return t;
  }
}
