
/**
 * @author Jjn
 * @since 2021/6/13 16:09
 */
public class SolutionInterview0106 {
    public boolean oneEditAway(String first, String second) {
        int lengthFirst = first.length();
        int lengthSecond = second.length();
        if (Math.abs(lengthFirst - lengthSecond) >= 2) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < lengthFirst && j < lengthSecond && (first.charAt(i) == second.charAt(j))) {
            i++;
            j++;
        }
        if (lengthFirst > lengthSecond) {
            i++;
        } else if (lengthFirst < lengthSecond) {
            j++;
        } else {
            i++;
            j++;
        }
        while (i < lengthFirst && j < lengthSecond) {
            if (first.charAt(i) != second.charAt(j)) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        SolutionInterview0106 solutionInterview0106 = new SolutionInterview0106();
        System.out.println(solutionInterview0106.oneEditAway("aaab", "aaba"));
    }
}
