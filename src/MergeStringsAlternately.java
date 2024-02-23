public class MergeStringsAlternately {

  public static void main(String[] args) {
    // input
    String word1 = "abc";
    String word2 = "defghi";
    System.out.println(mergeAlternately(word1, word2));
  }

  private static String mergeAlternately(String word1, String word2) {
    StringBuilder mergedString = new StringBuilder();
    int i = 0;
    int j = 0;
    while (i < word1.length() && j < word2.length()) {
      mergedString.append(word1.charAt(i++));
      mergedString.append(word2.charAt(j++));
    }
    // append remaining chars from word1
    while (i < word1.length()) {
      mergedString.append(word1.charAt(i++));
    }
    // append remaining chars from word2
    while (j < word2.length()) {
      mergedString.append(word2.charAt(j++));
    }

    return mergedString.toString();
  }
}
