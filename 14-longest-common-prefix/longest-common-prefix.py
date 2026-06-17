class Solution(object):
    def longestCommonPrefix(self, strs):
        r=""
        strs.sort()
        i=0
        l=len(strs)
        while(i<len(strs[0])):
            if strs[0][i]==strs[l-1][i]:
                r+=strs[0][i]
            else:
                break
            i+=1
        return r