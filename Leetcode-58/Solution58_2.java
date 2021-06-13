/**
 * @author Jjn
 * @since 2021/6/12 00:13
 */
public class Solution58_2 {
    public String reverseWord(String s) {
        if (s == null) {
            return null;
        }
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            res.append(s, i + 1, j + 1).append(" ");
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        Solution58_2 solution582 = new Solution58_2();
        System.out.println(solution582.reverseWord("Hello world, this is Jjn  "));
    }
}
