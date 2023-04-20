package leet._1.TwoSum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in 0..nums.size-1) {
            for (j in (i+1)..nums.size-1) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }

    fun twoSumMap(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        return map.keys.toIntArray()
    }
}

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 18
    val twoSum = Solution().twoSumMap(nums, target)
    println(twoSum.contentToString())
}