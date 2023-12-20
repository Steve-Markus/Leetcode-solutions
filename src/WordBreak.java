import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {

  public static void main(String[] args) {
    // read input
    var s = "leetcode";
    List<String> wordDict = List.of("leet", "code");
    boolean b = wordBreak(s, wordDict);
    System.out.println(b);
  }

  private static boolean wordBreak(String s, List<String> wordDict) {
    Map<String, Boolean> map = new HashMap<>();
    // start recursion calls
    return result(s, wordDict, map);
  }

  private static boolean result(String target, List<String> words, Map<String, Boolean> map) {
    if (map.containsKey(target)) {
      // base case
      return map.get(target);
    }
    if (target.isEmpty()) {
      // base case
      return true;
    }
    for (var word : words) {
      // if target start with given word
      if (target.startsWith(word) && result(target.substring(word.length()), words, map)) {
        map.put(target, true);
        return true;
      }
    }
    // return false to previous recursive calls
    map.put(target, false);
    return false;
  }
}
