class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int zc=0;
        int mww=0;
        int r=0;
        for(int n:nums){
            if(n==0){
                zc++;
            }
            if(zc>1){
                int ln=nums[l];
                if(ln==0){
                    zc--;
                }
                l++;
            }
            int cw=r-l+1-zc;
            if(zc==0){
                cw-=1;
            }
            mww=Math.max(mww,cw);
            r++;
        }
        return mww;
    }
}