class Solution {
    public boolean uniformArray(int[] nums) {
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        if(min%2!=0){
            return true;
        }
        else{
            for(int n:nums){
                if(n%2!=0){
                    return false;
                }
            }
        }
        return true;
    }
}