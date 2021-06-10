/**
 * @author Jjn
 * @since 2021/6/11 07:24
 */
public class Solution1108 {
    public String deFangIpAddress(String address) {
        if (address == null) {
            return null;
        }
        char[] chars = address.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char ithChar : chars) {
            if (ithChar == '.') {
                stringBuilder.append("[.]");
            } else {
                stringBuilder.append(ithChar);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution1108 solution1108 = new Solution1108();
        System.out.println(solution1108.deFangIpAddress("0.0.0.0"));
        System.out.println(solution1108.deFangIpAddress("10.7.1.1"));
    }
}
