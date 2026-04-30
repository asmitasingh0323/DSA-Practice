
import re

class Solution:
    def isPalindrome(self, s: str) -> bool:
        result = re.sub(r'[^a-z0-9]', '', s.lower())

        l = 0
        r = len(result) - 1
        print(result)
        while l <= r:
            if result[l] == result[r]:
                l += 1
                r -= 1
            else:
                return False
        return True
        