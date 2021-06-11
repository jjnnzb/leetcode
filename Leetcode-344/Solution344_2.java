/**
 * @author Jjn
 * @since 2021-06-11 8:41
 */
public class Solution344_2 {
    public void reverseString(char[] s) {
        if (s == null) {
            return;
        }
        int length = s.length;
        for (int i = 0; i < length / 2; i++) {
            int j = length - i - 1;
            s[i] ^= s[j];
            System.out.println("s[i]:" + s[i] + ", s[j]:" + s[j]);
            s[j] ^= s[i];
            System.out.println("s[i]:" + s[i] + ", s[j]:" + s[j]);
            s[i] ^= s[j];
            System.out.println("s[i]:" + s[i] + ", s[j]:" + s[j]);
        }
    }
    
    public static void main(String[] args) {
        Solution344_2 solution34412 = new Solution344_2();
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        System.out.println(chars);
        solution34412.reverseString(chars);
        System.out.println(chars);
    }
}
