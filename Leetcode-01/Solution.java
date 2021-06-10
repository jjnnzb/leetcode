import java.util.Arrays;

/**
 * @author Jjn
 * @since 2021/6/9 19:32
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        if (length < 2) {
            throw new IllegalArgumentException("nums should own at least two elements.");
        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 8, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 8, 11, 15}, 15)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 8, 11, 15}, 10)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 8, 11, 15}, 26)));
    }
}
