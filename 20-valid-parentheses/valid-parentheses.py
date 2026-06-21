class Solution(object):
    def isValid(self, st):
        p={')':'(','}':'{',']':'['}
        s=[]
        for c in st:
            if c in p.values():
                s.append(c)
            elif c in p:
                if not s or p[c]!=s.pop():
                    return False
        return not s
        