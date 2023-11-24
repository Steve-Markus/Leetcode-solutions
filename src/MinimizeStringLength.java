public class MinimizeStringLength {

  public static void main(String[] args) {
    // read input
    var s = "aaabc";
    int i = minimizedStringLength(s);
    System.out.println(i);
  }

  private static int minimizedStringLength(String s) {
    // array to count actual letters
    var memory = new boolean[26];
    var ans = 0;
    for (var c : s.toCharArray()) {
      memory[c - 'a'] = true;
    }
    // if present letter count++
    for (var c : memory) {
      if (c) {
        ans++;
      }
    }
    // return result
    return ans;
  }

}
