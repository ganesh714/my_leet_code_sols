class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int idx1 = 0, idx2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    idx1 = i;
                    idx2 = j;
                    break;
                }
            }
        }
        return new int[]{idx1,idx2};
    }
}
