class Solution(object):
    def twoSum(self, nums, target):
        num={}
        for i,n in enumerate(nums):
            complement =target-n
            if complement in num:
                return [num[complement],i]
            num[n]=i
        return num        