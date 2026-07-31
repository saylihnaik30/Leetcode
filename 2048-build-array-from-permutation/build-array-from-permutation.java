class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            ans[i] = nums[a];
        }
        return ans;
    }
}