public class LongestSubstringWithoutRepeatCharacters {

  public static void main(String[] args) {
    // read input
    System.out.println(solution("abbbababcd"));
  }

  private static int solution(String s) {
    // result
    int maxLength = 0;
    // two pointers approach
    for (int right = 0, left = 0; right < s.length(); right++) {
      char symbol = s.charAt(right);
      int locationOfFirstIndex = s.indexOf(symbol, left);
      if (locationOfFirstIndex != right) {
        // diff symbol ++
        left = locationOfFirstIndex + 1;
      }
      // get max
      maxLength = Math.max(maxLength, right - left + 1);
    }
    // return result
    return maxLength;
  }
}
