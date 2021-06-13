import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author Jjn
 * @since 2021/6/12 08:34
 */
public class Solution9_1 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        List<Integer> digits = new ArrayList<>();
        while (x > 0) {
            int y = x % 10;
            digits.add(y);
            x = x / 10;
        }
        int size = digits.size();
        for (int i = 0; i < size / 2; i++) {
            Integer first = digits.get(i);
            Integer last = digits.get(size - 1 - i);
            if (!Objects.equals(first, last)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution9_1().isPalindrome(123454321));
        System.out.println(new Solution9_1().isPalindrome(12345321));
    }
}
