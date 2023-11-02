public class CountAsterisks {

  public static void main(String[] args) {
    // read input
    var s = "l|*e*et|c**o|*de|";
    int i = countAsterisks(s);
    System.out.println(i);
  }

  private static int countAsterisks(String s) {
    // 1. variable to count result
    int barCount = 0;
    int asteriskCount = 0;
    // 2. iterate over input
    for (char ch : s.toCharArray()) {
      barCount += ch == '|' ? 1 : 0;
      // 3. calculate count
      asteriskCount += barCount == 0 && ch == '*' ? 1 : 0;
      barCount = barCount == 2 ? 0 : barCount;
    }
    // 4. return result
    return asteriskCount;
  }
}
