class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        } 
        int[] n = new int[128];
        char[] c = t.toCharArray();
        for(int i=0;i<c.length;i++){
            n[c[i]]++;
        }
        int l=0,r=0,st=0;
        int req=t.length();
        int m=Integer.MAX_VALUE;
        while(r<s.length()){
            char a=s.charAt(r);
            if(n[a]>0){
                req--;
            }
            n[a]--;
            r++;
            while(req==0){
                if(r-l-1<m){
                    m=r-l;
                    st=l;
                }
                char u=s.charAt(l);
                n[u]++;
                if (n[u]>0){
                    req++;
                }
                l++;
            }
        } 
        return m==Integer.MAX_VALUE?"":s.substring(st,st+m);
    }
}