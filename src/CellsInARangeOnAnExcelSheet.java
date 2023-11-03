import java.util.LinkedList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {

  public static void main(String[] args) {
    // read input
    var s = "K1:L2";
    List<String> cells = cellsInRange(s);
    cells.forEach(System.out::println);
  }

  private static List<String> cellsInRange(String s) {
    // read input
    char columnStart = s.charAt(0);
    char columnEnd = s.charAt(3);
    char rowStart = s.charAt(1);
    char rowEnd = s.charAt(4);

    List<String> cells = new LinkedList<>();

    // iterate and add each cell
    for (char column = columnStart; column <= columnEnd; column++) {
      for (char row = rowStart; row <= rowEnd; row++) {
        cells.add(column + String.valueOf(row));
      }
    }
    // return result
    return cells;
  }
}
