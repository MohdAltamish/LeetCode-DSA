class Solution {
    public int sortPermutation(int[] nums) {
        int ans = -1;
        boolean misplaced = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                ans &= nums[i];
                misplaced = true;
            }
        }
        return misplaced ? ans : 0;
    }
}