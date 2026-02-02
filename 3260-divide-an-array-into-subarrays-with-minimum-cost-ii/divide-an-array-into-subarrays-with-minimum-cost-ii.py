class Solution:
    def minimumCost(self, nums: List[int], k: int, dist: int) -> int:
        k-=2
        c=nums.pop(0)
        result=float('inf')
        w=SortedList(nums[:dist])
        c+=sum(w[:k])
        for l,r in zip(nums,nums[dist:]):
            w.add(r)
            c+=min(w[k],r)
            result=min(result,c)
            c-=min(w[k],l)
            w.remove(l)
        return result