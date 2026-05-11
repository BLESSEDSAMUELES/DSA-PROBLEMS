class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int n:nums){
            String s=String.valueOf(n);
            for(char ch:s.toCharArray()){
                l.add(ch-'0');
            }
        }
        int[] result=new int[l.size()];
        for(int i=0;i<l.size();i++){
            result[i]=l.get(i);
        }
        return result;
    }
}