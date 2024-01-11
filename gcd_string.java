// https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String minStr = (str1.length() > str2.length()) ? str2 : str1;
        String maxStr = (str1.length() > str2.length()) ? str1 : str2;

        int divisorLen = minStr.length();

        while (divisorLen > 0) {
            String substring = minStr.substring(0, divisorLen);

            Boolean isGCDWithDividend = checkIsDivisible(substring, maxStr);
            Boolean isGCDWithItself = checkIsDivisible(substring, minStr);
            System.out.println(divisorLen + " " + substring + " " + isGCDWithDividend + " " + isGCDWithItself);
            if (isGCDWithDividend && isGCDWithItself) return substring;

            divisorLen--;
        }

        return "";
    }



    private Boolean checkIsDivisible(String divisor, String dividend) {
        String []arr = dividend.split("(?<=\\G.{" + divisor.length() + "})");
        
        for ( String str : arr) {
            if (!str.equals(divisor)) return false;
        }

        return true;
    } 
}


public class gcd_string {
    public static void main(String[] args) {
        System.out.println(new Solution().gcdOfStrings("abab", "ababab"));
    }
}
