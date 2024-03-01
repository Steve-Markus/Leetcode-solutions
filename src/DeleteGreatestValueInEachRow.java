import java.util.Arrays;

public class DeleteGreatestValueInEachRow {

  public static void main(String[] args) {
    // read input
    int[][] grid = {{1, 2, 4}, {3, 3, 1}};
    int i = deleteGreatestValue(grid);
    System.out.println(i);
  }

  private static int deleteGreatestValue(int[][] grid) {
    // sort
    for (int i = 0; i < grid.length; i++) {
      Arrays.sort(grid[i]);
    }

    int result = 0;
    // get each grid
    for (int i = 0; i < grid[0].length; i++) {
      int max = 0;
      // search max element
      for (int j = 0; j < grid.length; j++) {
        int val = grid[j][i];
        if (max < val) {
          max = val;
        }
      }
      result += max;
    }

    // return result
    return result;
  }
}
