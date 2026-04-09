class Solution {
    public String reverseVowels(String s) {
        char[] c=s.toCharArray();
        int i=0;
        int n=s.length();
        String v="AEIOUaeiou";
        while(i<n-1){
            while(i<n-1 && v.indexOf(c[i])==-1){
                i++;
            }
            while(i<n-1 && v.indexOf(c[n-1])==-1){
                n--;
            }
            char t=c[i];
            c[i]=c[n-1];
            c[n-1]=t;
            i++;
            n--;
        }
        String res=new String(c);
        return res;
    }
}