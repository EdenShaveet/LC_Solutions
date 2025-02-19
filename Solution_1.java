import java.util.Arrays;

class Solution_1{
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }


    public static void main(String[] args){
        Solution_1 solution = new Solution_1();
        int[] nums = {2,5,5,11};
        int target = 10;

        int[] answer = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(answer));
    }
}