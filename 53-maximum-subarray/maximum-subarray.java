class Solution {
    public int maxSubArray(int[] nums) {
        int s=nums[0];
        int m=nums[0];
        for(int i=1;i<nums.length;i++){
            s=Math.max(nums[i],s+nums[i]);
            m=Math.max(m,s);
        }
        return m;
    }
}