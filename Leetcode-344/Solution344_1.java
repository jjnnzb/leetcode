/**
 * @author Jjn
 * @since 2021-06-11 8:41
 */
public class Solution344_1 {
    public void reverseString(char[] s) {
        if (s == null) {
            return;
        }
        int length = s.length;
        for (int i = 0; i < length / 2; i++) {
            char tmp;
            tmp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = tmp;
        }
    }
    
    public static void main(String[] args) {
        Solution344_1 solution3441 = new Solution344_1();
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        System.out.println(chars);
        solution3441.reverseString(chars);
        System.out.println(chars);
    }
}
