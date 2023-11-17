import java.util.Arrays;

public class FindArrayGivenSubsetSums {

  public static void main(String[] args) {
    // read input
    var n = 3;
    int[] sums = {-3, -2, -1, 0, 0, 1, 2, 3};
    System.out.println(Arrays.toString(recoverArray(n, sums)));
  }

  private static int[] recoverArray(int n, int[] sums) {
    // sort elements
    Arrays.sort(sums);
    int l = sums.length;
    int z = 0;
    // create new array
    int[] r = new int[n];
    // iterate over elements
    for (int i = 0; i < n; ++i) {
      var d = sums[1] - sums[0];
      var p = 0;
      var k = 0;
      for (int j = 0; j < l; ++j) {
        if (k < p && sums[k] == sums[j]) {
          k++;
        } else {
          sums[p++] = sums[j] + d;
        }
      }
      // search element
      if (Arrays.binarySearch(sums, 0, l / 2, z) >= 0) {
        r[i] = -d;
      } else {
        r[i] = d;
        z += d;
      }
      l /= 2;
    }
    // return result
    return r;
  }
}
