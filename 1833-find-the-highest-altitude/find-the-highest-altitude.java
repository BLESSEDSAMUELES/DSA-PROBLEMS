class Solution {
    public int largestAltitude(int[] gain) {
        int m=0<gain[0]?gain[0]:0;
        for(int i=1;i<gain.length;i++){
            gain[i]+=gain[i-1];
            if(gain[i]>m){
                m=gain[i];
            }
        }
        return m;
    }
}