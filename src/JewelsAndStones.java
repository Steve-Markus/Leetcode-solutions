import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

  public static void main(String[] args) {
    // read input
    String jewels = "aA";
    String stones = "aAAbbbb";

    int i = numJewelsInStones(jewels, stones);
    System.out.println(i);
  }

  private static int numJewelsInStones(String jewels, String stones) {
    // map to hold items
    Map<Character, Integer> map = new HashMap<>();
    char[] chars = jewels.toCharArray();
    for (char aChar : chars) {
      // add if missing
      map.putIfAbsent(aChar, 0);
    }
    int count = 0;
    for (int i = 0; i < stones.length(); i++) {
      if (map.containsKey(stones.charAt(i))) {
        // add to the count
        count++;
      }
    }
    // return result
    return count;
  }
}
