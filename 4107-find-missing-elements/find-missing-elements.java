class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        for(int i=0;i<nums.length;i++,min++){
            if(min<nums[i]){
                a.add(min);
                i--;

            }                    
        }
        return a;
    }
}