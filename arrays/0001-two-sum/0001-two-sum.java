class Solution {
    // Mohd Altamish
    public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    result = new int[]{i, j};
            }
            }
        }
        return result;
    }
}
