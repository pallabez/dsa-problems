// https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75

import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 1;
        while (i < nums.length && nums[i] != 0) {
            i++;
            j++;
        }


        while (j < nums.length) {
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
            j++;
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
        // int[] arr = new int[]{ 0, 1, 0, 3, 12 };
        // int[] arr = new int[]{ 1, 1, 0, 0, 12 };
        int[] arr = new int[]{ 1 };

        new Solution().moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }
}
