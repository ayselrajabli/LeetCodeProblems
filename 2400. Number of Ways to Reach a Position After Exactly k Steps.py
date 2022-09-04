class Solution:
    def numberOfWays(self, startPos: int, endPos: int, k: int) -> int:
        if (startPos-endPos-k) % 2:
            return 0
        else:
            return comb(k, (endPos - startPos + k) // 2) % 1000000007
