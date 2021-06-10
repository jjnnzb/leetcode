import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int subtract = target - num;
            if (map.containsKey(subtract)) {
                return new int[]{map.get(subtract), i};
            }
            map.put(num, i);
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 8, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 3, 3, 11, 15}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 8, 11, 15}, 10)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 8, 11, 15}, 26)));
    }
}