class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int[] r=new int[n];
        for(int i=0;i<n;i++){
            if(seq.charAt(i)==')'){
                r[i]=i&1;
            }
            else{
                r[i]=1-(i&1);
            }
        }
        return r;
    }
}