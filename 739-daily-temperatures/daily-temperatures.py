class Solution(object):
    def dailyTemperatures(self, temperatures):
        stack=[]
        ans=[0]*len(temperatures)
        for i in range(len(temperatures)):
            while stack and temperatures[i]>temperatures[stack[-1]]:
                p=stack.pop()
                ans[p]=i-p
            stack.append(i)
        return ans