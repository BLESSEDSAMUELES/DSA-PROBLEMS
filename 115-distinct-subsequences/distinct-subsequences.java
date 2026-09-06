class Solution {
    public int numDistinct(String s, String t) {
        int n=t.length();
        long[] dp=new long[n+1];
        dp[0]=1;
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            for(int j=n;j>0;j--){
                if(c==t.charAt(j-1)){
                    dp[j]+=dp[j-1];
                }
            }
        }
        return (int) dp[n];
    }
}