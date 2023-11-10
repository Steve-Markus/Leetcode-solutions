import java.util.Arrays;

public class CheckIfTheSentenceIsPangram {

  public static void main(String[] args) {
    // read input
    var sentence = "thequickbrownfoxjumpsoverthelazydog";
    boolean b = checkIfPangram(sentence);
    System.out.println(b);
  }

  private static boolean checkIfPangram(String sentence) {
    return Arrays.stream(sentence.split("")).distinct().count() == 26;
  }
}
