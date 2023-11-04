public class ExcelSheetColumnTitle {

  public static void main(String[] args) {
    // read input
    int columnNumber = 30;
    String s = convertToTitle(columnNumber);
    System.out.println(s);
  }

  private static String convertToTitle(int columnNumber) {
    var builder = new StringBuilder();
    // calculate result while num is bigger than zero
    while (columnNumber-- > 0) {
      // add
      builder.insert(0, (char) ('A' + (columnNumber % 26)));
      columnNumber = columnNumber / 26;
    }
    // return result
    return builder.toString();
  }
}
