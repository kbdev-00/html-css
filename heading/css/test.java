import java.util.*;

class test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(solve(str));
  }

  static String solve(String str) {

    HashSet<Character> set = new HashSet<>();

    int left = 0;
    int maxLength = 0;

    for (int right = 0; right < str.length(); right++) {

      char ch = str.charAt(right);

      // Remove characters until duplicate is gone
      while (set.contains(ch)) {
        set.remove(str.charAt(left));
        left++;
      }

      set.add(ch);

      maxLength = Math.max(maxLength, right - left + 1);
    }

    return String.valueOf(maxLength);
  }
}