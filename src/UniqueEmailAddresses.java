import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

  public static void main(String[] args) {
    // read input
    String[] emails = {
        "test.email+alex@leetcode.com",
        "test.e.mail+bob.cathy@leetcode.com",
        "testemail+david@lee.tcode.com"};
    int i = numUniqueEmails(emails);
    System.out.println(i);
  }

  private static int numUniqueEmails(String[] emails) {
    // variable for result
    Set<String> set = new HashSet<>();
    // iterate over elements
    for (var current : emails) {
      var sb = new StringBuilder();
      // find index of @
      int indexOf = current.indexOf('@');
      String localName = current.substring(0, indexOf);
      String domainName = current.substring(indexOf);
      for (int i = 0; i < localName.length(); i++) {
        // if '.' continue
        if (localName.charAt(i) == '.') {
          continue;
        }
        if (localName.charAt(i) == '+') {
          break;
        }
        // add char
        sb.append(localName.charAt(i));
      }
      // add domain name
      sb.append(domainName);
      set.add(sb.toString());
    }
    // return result
    return set.size();
  }
}
