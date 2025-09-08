def isHasZero(s1,s2):
        while(s1>0):
            digit=s1%10
            s1/=10
            if digit==0:
                return 0
        while(s2>0):
            digit=s2%10
            s2/=10
            if digit==0:
                return 0
        return 1    
class Solution(object):
    def getNoZeroIntegers(self, n):
        s1=0
        s2=0
        for i in range(1,n):
            s1=i
            s2=n-i
            if i>n/2 and isHasZero(s1,s2):
                break
        return s2,s1
    