public class WordSearch {

  public static void main(String[] args) {
    // read input
    char[][] board = {
        {'A', 'B', 'C', 'E'},
        {'S', 'F', 'C', 'S'},
        {'A', 'D', 'E', 'E'}
    };
    var word = "ABCCED";
    System.out.println(exist(board, word));
  }

  private static boolean[][] visited;
  private static int r, c;

  private static boolean exist(char[][] board, String word) {
    r = board.length;
    c = board[0].length;
    visited = new boolean[r][c];

    for (int cr = 0; cr < r; cr++) {
      for (int cc = 0; cc < c; cc++) {
        if (dfc(cr, cc, 0, board, word)) {
          return true;
        }
      }
    }
    return false;
  }

  private static boolean dfc(int cr, int cc, int count, char[][] board, String word) {
    // base cases
    // valid range
    if (cr < 0 || cr >= r || cc < 0 || cc >= c) {
      return false;
    }
    // visited
    if (visited[cr][cc]) {
      return false;
    }

    // different
    if (word.charAt(count) != board[cr][cc]) {
      return false;
    }

    // found
    if (count == word.length() - 1) {
      return true;
    }

    // mark current visited
    visited[cr][cc] = true;

    // increment count
    count++;

    // dfs down, right, up, left search
    if (dfc(cr + 1, cc, count, board, word) ||
        dfc(cr, cc + 1, count, board, word) ||
        dfc(cr - 1, cc, count, board, word) ||
        dfc(cr, cc - 1, count, board, word)) {
      return true;
    }

    // backtracking
    // mark as unvisited
    visited[cr][cc] = false;

    return false;
  }

}
