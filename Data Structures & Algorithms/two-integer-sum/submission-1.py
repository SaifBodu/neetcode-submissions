class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        lookup= {}
        for i, num in enumerate(nums):
            rem = target - num
            if rem in lookup:
                return [lookup[rem], i]
            else:
                lookup[num] = i

        return []