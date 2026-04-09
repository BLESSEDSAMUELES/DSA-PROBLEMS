class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ec) {
        int max=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>max){
                max=c[i];
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(int i=0;i<c.length;i++){
            int sum=0;
            sum=c[i]+ec;
            if(sum>=max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}