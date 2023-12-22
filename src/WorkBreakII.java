import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkBreakII {
    public static void main(String[] args) {
        // read input
        var s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");

        List<String> result = wordBreak(s, wordDict);
        System.out.println(Arrays.toString(result.toArray()));
    }

    private static List<String> wordBreak(String s, List<String> wordDict) {
        var result = new ArrayList<String>();
        solve(s, wordDict, result, "", 0);
        return result;
    }

    private static void solve(String s, List<String> wordDict, List<String> result, String current, int index) {
        // length of word as pointer
        int l = s.length();
        if (index == l) {
            // base case
            result.add(current.substring(0, current.length() - 1));
            return;
        }
        // iterate and make recursive calls
        for (int i = index; i < l; i++) {
            String word = s.substring(index, i + 1);
            if (wordDict.contains(word)) {
                solve(s, wordDict, result, current + word + " ", i + 1);
            }
        }
    }

}
