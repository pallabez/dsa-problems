// https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        HashSet<List<Integer>> hs = new HashSet<>();

        // System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length - 2; i++) {
            int requiredVal = -nums[i];
            
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for(int j = i + 1, k = nums.length - 1; j < k; ) {
                int sum = nums[j] + nums[k];

                if (sum == requiredVal) {
                    // System.err.println(i + " " + j + " " + k);
                    List<Integer> sol = new ArrayList<Integer>();
                    sol.add(nums[i]);
                    sol.add(nums[j]);
                    sol.add(nums[k]);

                    hs.add(sol);
                    j++;
                    k--;
                }
                else if (sum < requiredVal) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return new ArrayList<>(hs);
    }
}

public class three_sum {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // List<List<Integer>> result = sol.threeSum(new int[]{ -1, 0, 1, 2, -1, -4 });
        List<List<Integer>> result = sol.threeSum(new int[]{-2,0,0,2,2 });

        for (List<Integer> arr : result) {
            System.out.println(arr.toString());
        }
    }
}
