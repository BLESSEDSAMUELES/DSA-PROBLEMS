class Solution(object):
    def isPalindrome(self, x):
        digit=0
        rev=0
        if(x<0):
            return False
        n=x
        while(x!=0):
            digit=x%10
            rev=(rev*10)+digit
            x/=10
        if(rev==n):
            return True
        else:
            return False
        