class Solution {
    public String gcdOfStrings(String s1, String s2) {
       String r1=s1+s2;
       String r2=s2+s1;
       int g=gcd(s1.length(),s2.length());
       if(r1.equals(r2)){
            return s1.substring(0,g);
       }
       return "";
    }
    private int gcd(int a,int b){
        return b==0 ? a: gcd(b,a%b);
    }
}