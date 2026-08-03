class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int counter=0,res=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                counter++;
                res+=counter;
            }
            else{
                counter=0;
            }
        }
        return res;
    }
}