class Solution {
    public String removeStars(String s) {
        int i=0;
        StringBuilder sb=new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='*'){
                sb.deleteCharAt(i-1);
                i-=1;
            }
            else{
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }
}