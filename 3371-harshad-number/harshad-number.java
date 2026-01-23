class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int d,s=0,n=x;
        while(x!=0){
            d=x%10;
            s+=d;
            x/=10;
        }
        if(n%s==0)
            return s;
        else
        return -1;
    }
}