class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i<w1.length()||i<w2.length()){
            if(i<w1.length()){
                res.append(w1.charAt(i));
            }
            if(i<w2.length()){
                res.append(w2.charAt(i));
            }
            i++;
        }
        return res.toString();
    }
}