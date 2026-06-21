class Solution(object):
    def productExceptSelf(self, nums):
        n=len(nums)
        a=[1]*n
        for i in range(1,n):
            a[i]=a[i-1]*nums[i-1]
        pS=1
        for i in range(n-2,-1,-1):
            pS*=nums[i+1]
            a[i]*=pS
        return a