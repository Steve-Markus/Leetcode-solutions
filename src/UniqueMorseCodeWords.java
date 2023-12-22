import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueMorseCodeWords {

  private static final String[] morse = new String[]{
      ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
      ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
      "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
  };

  public static void main(String[] args) {
    // read input
    var words = new String[]{"gin", "zen", "gig", "msg"};

    int i = uniqueMorseRepresentations(words);
    System.out.println(i);
  }

  private static int uniqueMorseRepresentations(String[] words) {
    var map = loadTable();
    for (int i = 0; i < words.length; i++) {
      // get single word
      String word = words[i];
      StringBuilder morse = new StringBuilder();
      for (int j = 0; j < word.length(); j++) {
        // get chars related to morse symbols
        morse.append(map.get(word.charAt(j)));
      }
      words[i] = morse.toString();
    }
    // return result with set to distinct final result
    return new HashSet<>(Arrays.asList(words)).size();
  }


  private static Map<Character, String> loadTable() {
    Map<Character, String> map = new HashMap<>();
    // using two pointers
    // first is for symbols for 97-123
    // second pointer is for morse elements
    for (int i = 97, j = 0; i < 123; i++, j++) {
      map.put((char) i, morse[j]);
    }
    return map;
  }
}
