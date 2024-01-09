// https://leetcode.com/problems/merge-strings-alternately/description/?source=submission-ac

class Solution {
  public String mergeAlternately(String word1, String word2) {
    int minLength = Math.min(word1.length(), word2.length());
    StringBuilder result = new StringBuilder("");

    
    for (int i = 0; i < minLength; ++i) {
      result.append(word1.charAt(i));
      result.append(word2.charAt(i));
    }

    if (word1.length() > minLength) {
      result.append(word1.substring(minLength));
    } 

    if (word2.length() > minLength) {
      result.append(word2.substring(minLength));
    }

    return result.toString();
  }
}

class merge_alternatively {
  public static void main(String[] args) {
    String str = new Solution().mergeAlternately("hello", "world");
    System.out.println(str);
  }
}