class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<Integer> set1= new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        HashSet<Integer> set2= new HashSet<>();
        for(int num:nums2){
            set2.add(num);
        }
        List<Integer> first=new ArrayList<>();
        for(int num1:set1){
            if(!set2.contains(num1)){
                first.add(num1);
            }
        }
        List<Integer> second=new ArrayList<>();
        for(int num1:set2){
            if(!set1.contains(num1)){
                second.add(num1);
            }
        }
        list.add(first);
        list.add(second);
        return list;
    }
}