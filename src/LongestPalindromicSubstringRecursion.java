public class LongestPalindromicSubstringRecursion {

  public static void main(String[] args) {
    // read input
    var s = "babad";
    String res = longestPalindrome(s);
    System.out.println(res);
  }

  private static String longestPalindrome(String s) {
    // bottom case
    if (s.contentEquals(new StringBuilder(s).reverse())) {
      return s;
    }
    // start recursion to left
    var l = longestPalindrome(s.substring(1));
    // start recursion to right
    var r = longestPalindrome(s.substring(0, s.length() - 1));
    // return longest one
    if (l.length() > r.length()) {
      return l;
    } else {
      return r;
    }
  }
}
