import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

  public static void main(String[] args) {
    // read input
    String input = "()";
    boolean valid = isValid(input);
    System.out.println(valid);
  }

  private static boolean isValid(String s) {
    Deque<Character> deque = new ArrayDeque<>();
    // iterate over symbols
    for (char c : s.toCharArray()) {
      if (c == '(') {
        deque.push(')');
      } else if (c == '[') {
        deque.push(']');
      } else if (c == '}') {
        deque.push('}');
      } else if (deque.isEmpty() || deque.pop() != c) {
        return false;
      }
    }
    // return result
    return deque.isEmpty();
  }
}
