public class ZigzagConversion {

  public static void main(String[] args) {
    // read input
    var s = "PAYPALISHIRING";
    var numRows = 3;
    System.out.println(convert(s, numRows));
  }

  private static String convert(String s, int numRows) {
    // base case
    if (numRows == 1 || numRows >= s.length() || s.length() == 1) {
      return s;
    }

    int k = numRows * 2 - 2;
    var result = new StringBuilder();
    // iterate over rows
    for (int i = 0; i < numRows; i++) {
      int left = i;
      int right = k - i;
      if (i == 0 || i == numRows - 1) {
        right = s.length();
      }

      for (int j = 0; j < s.length() / numRows + 1; j++) {
        // if true add left
        if (left < s.length()) {
          result.append(s.charAt(left));
        }
        // if true add right
        if (right < s.length()) {
          result.append(s.charAt(right));
        }
        // sum values
        left += k;
        right += k;
      }
    }
    // return result
    return result.toString();
  }
}
