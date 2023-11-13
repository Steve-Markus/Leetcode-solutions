public class IsSubsequence {

  public static void main(String[] args) {
    // read input
    var s = "abc";
    var t = "ahbgdc";
    boolean subsequence = isSubsequence(s, t);
    System.out.println(subsequence);
  }

  private static boolean isSubsequence(String s, String t) {
    int i = 0;
    int j = 0;
    while (i < s.length() && j < t.length()) {
      // two pointers approach
      if (s.charAt(i) == t.charAt(j)) {
        i++;
      }
      j++;
    }
    // return true if equals
    return i == s.length();
  }
}
