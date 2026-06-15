class Solution(object):
    def isPalindrome(self, s):
        o="".join(c for c in s if c.isalnum())
        r=o[::-1]
        if o.lower()==r.lower():
            return True
        return False
        