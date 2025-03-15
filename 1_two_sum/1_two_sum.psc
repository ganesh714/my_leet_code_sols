function twoSum(nums, target):
    n = length(nums)

    for i from 0 to (n - 1):
        for j from (i + 1) to (n - 1):
            if nums[i] + nums[j] == target:
                idx1 = i
                idx2 = j
                break

    return [idx1, idx2]
