class Solution(object):
    def findScore(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        arr = [(nums[i],i) for i in range (0,len(nums))]
        arr.sort()
        score = 0
        visited = set()
        for v, i in arr:
            if i not in visited:
                score +=v
                visited.add(i)
                visited.add(i+1)
                visited.add(i-1)
        return score