public class SumOfAllOddLengthSubarrays {

  public static void main(String[] args) {
    // read input
    int[] arr = {1, 4, 2, 5, 3};
    int i = sumOddLengthSubarrays(arr);
    System.out.println(i);
  }

  private static int sumOddLengthSubarrays(int[] arr) {
    int res = 0;
    // length
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      // count how many times this index takes part in all sub-arrays
      int allCount = (n - i) * (i + 1);
      // count how many odd arrays are inside allCount
      int oddCount = allCount % 2 == 0 ? allCount / 2 : allCount / 2 + 1;
      // sum of all occurrences
      res += oddCount * arr[i];
    }
    // return result
    return res;
  }
}
