public class RomanToInteger {

  public static void main(String[] args) {
    // read input
    String input = "LVIII";
    int i = romanToInt(input);
    System.out.println(i);
  }

  private static int romanToInt(String s) {
    int result = 0;
    // iterate over chars
    for (int i = 0; i < s.length() - 1; i++) {
      result += getNum(s.charAt(i), s.charAt(i + 1));
    }
    result += getNum(s.charAt(s.length() - 1), ' ');

    // return result
    return result;
  }

  private static int getNum(char current, char next) {
    return switch (current) {
      case 'M' -> 1000;
      case 'D' -> 500;
      case 'C' -> next == 'M' || next == 'D' ? -100 : 100;
      case 'L' -> 50;
      case 'X' -> next == 'C' || next == 'L' ? -10 : 10;
      case 'V' -> 5;
      case 'I' -> next == 'X' || next == 'V' ? -1 : 1;
      default -> 0;
    };
  }
}
