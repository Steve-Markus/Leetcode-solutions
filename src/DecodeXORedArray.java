import java.util.Arrays;

public class DecodeXORedArray {

  public static void main(String[] args) {
    int[] encoded = {1, 2, 3};
    int first = 1;

    int[] decoded = decode(encoded, first);

    System.out.println("Decoded Array: " + Arrays.toString(decoded));
  }

  private static int[] decode(int[] encoded, int first) {
    // initialize the result array with one extra element
    int[] result = new int[encoded.length + 1];
    // the first element is known and set
    result[0] = first;

    // decode the array using XOR
    for (int i = 0; i < encoded.length; i++) {
      // XOR the previous result with the current element
      result[i + 1] = result[i] ^ encoded[i];
    }

    // return the decoded array
    return result;
  }
}
