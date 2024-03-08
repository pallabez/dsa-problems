import java.util.Iterator;
import java.util.Stack;


class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '*') {
                if (!stack.empty()) stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for(Iterator<Character> i = stack.iterator();i.hasNext();) {
            char c = i.next();

            result.append(c);
        }

        return result.toString();
    }
}

public class removing_stars_from_a_string {
    public static void main(String[] args) {
        Solution s = new Solution();
        String result = s.removeStars("*hello**oko*");
        System.out.println(result);
    }
}
