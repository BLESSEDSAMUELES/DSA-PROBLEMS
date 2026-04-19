class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,ml=0,zc=0;
        for(int r=0;r<nums.length;++r){
            if(nums[r]==0){
                zc++;
            }
            while(zc>k){
                if(nums[l]==0){
                    zc--;
                }
                l++;
            }
            ml=Math.max(ml,r-l+1);
        }
        return ml;
    }
}