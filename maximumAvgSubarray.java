// https://leetcode.com/problems/maximum-average-subarray-i/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;

        int start = 0, end = 0;
        double totalAvg = 0;
        while (end < k) {
            totalAvg += (double)nums[end] / k;
            end++;
        }

        if (totalAvg > max) max = totalAvg;

        while (end < nums.length) {
            totalAvg += (double)nums[end] / k;
            totalAvg -= (double)nums[start] / k;
            start++;
            end++;
            
            if (totalAvg > max) max = totalAvg;
        }

        return max;
    }
}

public class maximumAvgSubarray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int []arr = new int[] {1, 2, 4, -2, -4};

        Double result = s.findMaxAverage(arr, 2);
        System.out.println(result);
    }
}