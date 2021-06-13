import java.util.ArrayList;
import java.util.List;

/**
 * @author Jjn
 * @since 2021/6/13 01:15
 */
public class SolutionInterview0108 {
    public void setZeroes(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        int length = matrix.length;
        int column = 0;
        List<Integer> zeroLines = new ArrayList<>();
        List<Integer> zeroColumns = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int[] lines = matrix[i];
            column = lines.length;
            for (int j = 0; j < column; j++) {
                int line = lines[j];
                if (line == 0) {
                    zeroColumns.add(j);
                    zeroLines.add(i);
                }
            }
        }
        int size = zeroLines.size();
        if (size > 0) {
            int finalColumn = column;
            zeroLines.forEach(integer -> {
                matrix[integer] = new int[finalColumn];
            });
            zeroColumns.forEach(integer -> {
                for (int i = 0; i < length; i++) {
                    matrix[i][integer] = 0;
                }

            });
        }

    }

    public static void main(String[] args) {
        SolutionInterview0108 solutionInterview0108 = new SolutionInterview0108();
        int[][] array = new int[][]{{1, 2, 3, 4}, {0, 1, 2, 3}, {2, 3, 4, 5}};
        solutionInterview0108.setZeroes(array);
    }

}
