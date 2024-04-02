// https://leetcode.com/problems/keys-and-rooms

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 1; i < rooms.size(); i++) {
            hs.add(i);
        }

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);

        System.out.println(q + " " + hs);
        while(!q.isEmpty()) {
            List<Integer> keys = rooms.get(q.remove());

            for (int key: keys) {
                if (hs.contains(key)) {
                    hs.remove(key);
                    q.add(key);
                }
            }

            if (hs.isEmpty()) return true;
        }

        return hs.isEmpty();
    }
}

public class keys_and_rooms {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        l.add(Arrays.asList(1));
        l.add(Arrays.asList(2));
        l.add(Arrays.asList(3));
        l.add(Arrays.asList());
            
        Boolean result = s.canVisitAllRooms(l);

        System.out.println(result);
    }
}
