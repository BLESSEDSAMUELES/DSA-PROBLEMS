class Solution(object):
    def majorityElement(self, nums):
        n=len(nums)
        seen=set()
        for i in nums:
            if i in seen:
                continue
            seen.add(i)
            
            f=0
            for j in nums:
                if i==j:
                    f+=1
            if f>n/2:
                return i
        