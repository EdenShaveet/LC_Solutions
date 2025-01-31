import java.util.Arrays;

//Solution
class Solution_1480 {
    public int[] runningSum(int[] nums) {
        int results[] = new int[nums.length];
        results[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    //Main method
    public static void main(String[] args) {
        Solution_1480 solution = new Solution_1480();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.runningSum(nums);

        System.out.println(Arrays.toString(result));
    }
}
