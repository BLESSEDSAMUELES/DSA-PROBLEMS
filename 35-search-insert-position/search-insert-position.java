class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for( i=0;i<nums.length;i++){
            if(target<nums[i]){
                return i;
            }
            if(nums[i]==target){
                return i;
            }
            else if(i!=0 &&nums[i-1]<target && nums[i]>target){
                return i;
            }
        }
        return i;
}
}