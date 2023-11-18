public class CheckIfTwoStringArraysAreEquivalent {

  public static void main(String[] args) {
    // read input
    String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
    boolean b = arrayStringsAreEqual(word1, word2);
    System.out.println(b);
  }

  private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    // two pointers approach
    int wordOnePointer = 0;
    int wordTwoPointer = 0;

    int charOnePointer = 0;
    int charTwoPointer = 0;

    // while pointers are less than length
    while (wordOnePointer < word1.length && wordTwoPointer < word2.length) {
      char charOne = word1[wordOnePointer].charAt(charOnePointer++);
      char charTwo = word2[wordTwoPointer].charAt(charTwoPointer++);
      if (charOne != charTwo) {
        return false;
      }
      // reset char pointer if needed
      if (charOnePointer == word1[wordOnePointer].length()) {
        wordOnePointer++;
        charOnePointer = 0;
      }

      if (charTwoPointer == word2[wordTwoPointer].length()) {
        wordTwoPointer++;
        charTwoPointer = 0;
      }
    }
    // return result
    return wordOnePointer == word1.length && wordTwoPointer == word2.length;
  }
}
