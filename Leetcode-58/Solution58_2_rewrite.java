/**
 * @author Jjn
 * @since 2021/6/12 00:41
 */
public class Solution58_2_rewrite {
    public String reverseString(String s) {
        if (s == null) {
            return null;
        }
        char[] chars = s.toCharArray();
        int length = chars.length;
        int i = length - 1;
        int j = i;
        StringBuilder resultBuilder = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && chars[i] != ' ') {
                i--;
            }
            resultBuilder.append(s, i, j);
            while (i >= 0 && chars[i] == ' ') {
                i--;
            }
            j = i;
        }
        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        Solution58_2_rewrite solution582Rewrite = new Solution58_2_rewrite();
        System.out.println(solution582Rewrite.reverseString("Hi, this is Jjn. "));
    }
}
