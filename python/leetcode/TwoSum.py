from typing import List

class TwoSum:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numMap = {}
        n = len(nums)

        # Build the hash table
        for i in range(n):
            numMap[nums[i]] = i

        # Find the complement
        for i in range(n):
            complement = target - nums[i]
            if complement in numMap:
                return [i, numMap[complement]]

        return [] # No solution found

# Call the twoSum method
two_sum = TwoSum()
result = two_sum.twoSum([2, 7, 11, 15], 9)
print(result)
