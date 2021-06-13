/**
 * @author Jjn
 * @since 2021/6/13 00:35
 */
public class SolutionOfferBook0801 {

    public int strToInt(String str) {
        if (str == null) {
            return 0;
        }
        int threshold = Integer.MAX_VALUE / 10;
        String trimInput = str.trim();
        int length = trimInput.length();
        boolean isNegative = false;
        int result = 0;
        for (int i = 0; i < length; i++) {
            char c = trimInput.charAt(i);
            if (i == 0) {
                if (c == '+') {
                    continue;
                }
                if (c == '-') {
                    isNegative = true;
                    continue;
                }
            }
            if (Character.isDigit(c)) {
                if (result == threshold) {
                    if (c > '7') {
                        if (isNegative) {
                            return Integer.MIN_VALUE;
                        } else {
                            return Integer.MAX_VALUE;
                        }
                    }
                } else if (result > threshold){
                    if (isNegative) {
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }
                result = 10 * result + (c - '0');
            } else {
                break;
            }
        }
        if (isNegative) {
            return result * -1;
        }
        return result;
    }

    public static void main(String[] args) {
        SolutionOfferBook0801 solutionOfferBook08 = new SolutionOfferBook0801();
        System.out.println(solutionOfferBook08.strToInt(String.valueOf(Integer.MAX_VALUE - 1)));
    }
}
