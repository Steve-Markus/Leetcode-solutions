public class NumberOfChangingKeys {

  public static void main(String[] args) {
    var s = "aAbBcC";
    System.out.println(countKeyChanges(s));
    s = "AaAaAaaA";
    System.out.println(countKeyChanges(s));
  }

  private static int countKeyChanges(String s) {
    char[] arr = s.toLowerCase().toCharArray();
    int n = 0;
    for (int i = 1; i < arr.length; i++) {
      n = arr[i] == arr[i - 1] ? n : n + 1;
    }
    return n;
  }
}
