import java.util.Arrays;

/**
 * @author Jjn
 * @since 2021/6/13 19:10
 */
public class SolutionInterview1615 {
    public int[] masterMind(String solution, String guess) {
        if (solution == null || guess == null) {
            throw new IllegalArgumentException("Illegal arguments.");
        }
        int length = solution.length();
        boolean[] isHit = new boolean[length];
        boolean[] isUsed = new boolean[length];
        int rightGuess = 0;
        for (int i = 0; i < length; i++) {
            if (solution.charAt(i) == guess.charAt(i)) {
                rightGuess++;
                isUsed[i] = true;
                isHit[i] = true;
            }
        }
        int probableGuess = 0;
        for (int i = 0; i < length; i++) {
            if (isHit[i]) {
                continue;
            }
            for (int j = 0; j < length; j++) {
                if (solution.charAt(j) == guess.charAt(i) && !isUsed[j]) {
                    isUsed[j] = true;
                    probableGuess++;
                    break;
                }
            }
        }
        return new int[]{rightGuess, probableGuess};
    }

    public static void main(String[] args) {
        SolutionInterview1615 solutionInterview1615 = new SolutionInterview1615();
        System.out.println(Arrays.toString(solutionInterview1615.masterMind("RGRB", "BBBY")));
    }
}
