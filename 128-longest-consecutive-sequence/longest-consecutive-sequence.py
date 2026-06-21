class Solution(object):
    def longestConsecutive(self, nums):
        nums.sort()
        longest=0
        current_longest=min(1,len(nums))
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                continue
            elif nums[i]==nums[i-1]+1:
                current_longest+=1
            else:
                longest=max(longest,current_longest)
                current_longest=1
        return max(longest,current_longest)
