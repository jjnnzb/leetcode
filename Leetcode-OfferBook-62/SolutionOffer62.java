import java.util.TreeSet;

/**
 * @author Jjn
 * @since 2021/6/13 10:02
 */
public class SolutionOffer62 {
    public boolean isStraight(int[] nums) {
        int num = nums.length;
        if (num != 5) {
            throw new IllegalArgumentException("Invalid...");
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        int totalZero = 0;
        for (int j : nums) {
            if (j != 0) {
                treeSet.add(j);
            } else {
                totalZero++;
            }
        }
        if (treeSet.size() < 5 - totalZero || treeSet.size() + totalZero != 5) {
            return false;
        }
        return treeSet.last() - treeSet.first() < 5;
    }

    public static void main(String[] args) {
        SolutionOffer62 solutionOffer62 = new SolutionOffer62();
        System.out.println(solutionOffer62.isStraight(new int[]{0, 0, 0, 0, 5}));
    }
}
