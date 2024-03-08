class Solution {
    public int largestAltitude(int[] gain) {
        int largestAltititue = 0;
        int altitiude = 0;
        for (int g: gain) {
            altitiude += g;
            if (altitiude > largestAltititue) largestAltititue = altitiude;
        }

        return largestAltititue;
    }
}

public class find_the_highest_altitude {
    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.largestAltitude(new int[]{ 1, 3, -5, 6 });
        System.out.println(result);
    }
}   
