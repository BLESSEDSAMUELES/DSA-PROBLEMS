class Solution(object):
    def missingNumber(self, nums):
        n=len(nums)
        es=n*(n+1)//2
        As=sum(nums)
        return es-As

        