class Solution(object):
    def searchInsert(self, nums, target):
        l=0
        r=len(nums)-1
        while l<=r:
            m=(l+r)/2
            if nums[m]==target:
                return m
            elif nums[m]<target:
                l+=1
            else:
                r-=1
        if nums[m]<target:
            return m+1
        return m