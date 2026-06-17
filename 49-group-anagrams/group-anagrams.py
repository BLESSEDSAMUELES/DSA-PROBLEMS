class Solution(object):
    def groupAnagrams(self, strs):
        r=defaultdict(list)
        for s in strs:
            k="".join(sorted(s))
            r[k].append(s)
        return list(r.values())
        