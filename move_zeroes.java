// https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75

import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;

        for (int el : nums) {
            if (el == 0) {
                zeroCount++;
            }
        }

        int i = 0, j = 0;

        while (j < nums.length) {
            
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

public class move_zeroes {
    public static void main(String[] args) {
        int[] arr = new int[]{ 0, 1, 0, 3, 12 };

        new Solution().moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }
}
