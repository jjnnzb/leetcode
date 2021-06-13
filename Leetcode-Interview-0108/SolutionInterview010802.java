import java.util.Arrays;

/**
 * @author Jjn
 * @since 2021/6/13 09:39
 */
public class SolutionInterview010802 {
    public void setZeroes(int[][] matrix) {
        int linesNum = matrix.length;
        int columnNum = matrix[0].length;
        boolean[] lineArray = new boolean[linesNum];
        boolean[] columnArray = new boolean[columnNum];
        for (int i = 0; i < linesNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                if (matrix[i][j] == 0) {
                    lineArray[i] = true;
                    columnArray[j] = true;
                }
            }
        }
        for (int i = 0; i < linesNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                if (lineArray[i] || columnArray[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        SolutionInterview010802 solutionInterview010802 = new SolutionInterview010802();
        int[][] array = new int[][]{{1, 2, 3, 4}, {0, 1, 2, 3}, {2, 3, 4, 5}};
        solutionInterview010802.setZeroes(array);
    }
}
