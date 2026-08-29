class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen_indices = {}
        for i, n in enumerate(nums):
            diff = target - n
            if diff in seen_indices:
                return [seen_indices[diff], i]
            seen_indices[n] = i
        