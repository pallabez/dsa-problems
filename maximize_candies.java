// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) max = candy;
        }
        
        List<Boolean> result = new ArrayList<Boolean>();
        for (int candy : candies) {
            result.add((candy + extraCandies >= max));
        }

        return result;
    }
}

public class maximize_candies {
    public static void main(String[] args) {
        List<Boolean> result = new Solution().kidsWithCandies(new int[] { 1, 2, 4 }, 1);
        for (Boolean candy : result) {
            System.out.println(candy);
        }
    }
}
