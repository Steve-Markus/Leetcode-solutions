import java.util.Arrays;

public class PlusOne {

  public static void main(String[] args) {
    // read input
    int[] digits = {1, 2, 9, 1, 9};
    int[] ints = plusOne(digits);
    System.out.println(Arrays.toString(ints));
  }

  private static int[] plusOne(int[] digits) {
    // iterate over elements
    for (int i = digits.length - 1; i >= 0; i--) {
      // if element < 9, increment and return result
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }
    // create new array with length + 1
    digits = new int[digits.length + 1];
    digits[0] = 1;
    // return result
    return digits;
  }
}
