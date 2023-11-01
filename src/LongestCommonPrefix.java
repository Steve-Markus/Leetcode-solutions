import java.util.Arrays;

public class LongestCommonPrefix {

  public static void main(String[] args) {
    // read input
    String[] strs = {"flower", "flow", "flight"};
    String s = longestCommonPrefix(strs);
    System.out.println(s);
  }

  private static String longestCommonPrefix(String[] strs) {
    // 1. variable to hold result
    StringBuilder builder = new StringBuilder();
    int n = strs.length;
    // 2. sort elements
    Arrays.sort(strs);
    String first = strs[0];
    String last = strs[n - 1];
    // 3. find prefix
    for (int i = 0; i < first.length(); i++) {
      if (first.charAt(i) != last.charAt(i)) {
        break;
      }
      builder.append(first.charAt(i));
    }
    // 4. return result
    return builder.toString();
  }
}
