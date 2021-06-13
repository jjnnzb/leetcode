/**
 * @author Jjn
 * @since 2021-06-11 9:41
 */
public class Solution58 {
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }
        s = s.trim();
        String[] strings = s.split(" ");
        int length = strings.length;
        for (int i = 0; i < length / 2; i++) {
            String tmp;
            int j = length - i - 1;
            tmp = strings[i];
            strings[i] = strings[j];
            strings[j] = tmp;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            String string = strings[i];
            string = string.trim();
            if (string.length() == 0) {
                continue;
            }
            stringBuilder.append(string);
            if (i < length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
    
    public static void main(String[] args) {
        Solution58 solution58 = new Solution58();
        String testWord = "a good   example    ";
        System.out.println(testWord);
        System.out.println(solution58.reverseWords(testWord));
    }
}
