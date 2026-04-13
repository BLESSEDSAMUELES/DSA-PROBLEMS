class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        int j=n-1;
        int c=0;
        while(i<j){
            int s=nums[i]+nums[j];
            if(s==k){
                c++;
                i++;
                j--;
            }
            else if(s>k){
                j--;
            }
            else{
                i++;
            }
        }
        return c;
    }
}