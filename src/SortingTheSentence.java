import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortingTheSentence {

  public static void main(String[] args) {
    // read input
    var s = "is2 sentence4 This1 a3";
    String res = sortSentence(s);
    System.out.println(res);
  }

  private static String sortSentence(String s) {
    return Arrays
        // stream and split
        .stream(s.split("\\s++"))
        // sort by last char
        .sorted(Comparator.comparingInt(a -> a.charAt(a.length() - 1)))
        // map to remove last char
        .map(e -> e.substring(0, e.length() - 1))
        // collect result
        .collect(Collectors.joining(" "));
  }
}
