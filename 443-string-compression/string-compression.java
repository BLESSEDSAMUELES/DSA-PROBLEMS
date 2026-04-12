class Solution {
    public int compress(char[] chars) {
        int ans = 0;
        for(int i=0;i<chars.length;){
            final char l=chars[i];
            int c=0;
            while(i<chars.length && chars[i]==l){
                ++c;
                ++i;
            }
            chars[ans++]=l;
            if(c>1){
                for(final char ch: String.valueOf(c).toCharArray()){
                    chars[ans++]=ch;
                }   
            }
        }
        return ans;
    }
}