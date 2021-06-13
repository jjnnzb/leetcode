import java.util.Locale;

/**
 * @author Jjn
 * @since 2021/6/12 01:09
 */
public class Solution125_1 {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String lowerCase = s.toLowerCase(Locale.ROOT);
        char[] chars = lowerCase.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            if (Character.isLetterOrDigit(aChar)) {
                stringBuilder.append(aChar);
            }
        }
        s = stringBuilder.toString();
        int length = s.length();
        int mid = length / 2;
        for (int i = 0; i < mid; i++) {
            char ithChar = s.charAt(i);
            char finalChar = s.charAt(length - 1 - i);
            if (ithChar != finalChar) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution125_1 solution1251 = new Solution125_1();
        System.out.println(solution1251.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
