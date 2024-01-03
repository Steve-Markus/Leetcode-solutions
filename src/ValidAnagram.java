public class ValidAnagram {

  public static void main(String[] args) {
    // read input
    var s = "anagram";
    var t = "nagaram";
    boolean anagram = isAnagram(s, t);
    System.out.println(anagram);
  }

  private static boolean isAnagram(String s, String t) {
    // length of two input
    int a = s.length();
    int b = t.length();
    // return false if not equal
    if (a != b) {
      return false;
    }
    // array for memory
    int[] memory = new int[26];

    // iterate over elements to get chars
    for (int i = 0; i < a; i++) {
      memory[s.charAt(i) - 'a']++;
      memory[t.charAt(i) - 'a']--;
    }

    for (int i : memory) {
      if (i != 0) {
        return false;
      }
    }
    // inputs are valid anagram - return true
    return true;
  }
}
