import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> q = new LinkedList<Integer>();

    public RecentCounter() {
        q.clear();
    }
    
    public int ping(int t) {
        q.add(t);
        if (q.isEmpty()) {
            return 1;
        } else {
            int front = q.peek();
            while (t - front > 3000) {
                q.remove();
                front = q.peek();
            }

            return q.size();
        }
    }
}

public class number_of_recent_calls {
    public static void main(String[] args) {
        RecentCounter c = new RecentCounter();

        System.out.println(c.ping(0) + " " + c.ping(40) + " " + c.ping(3000) + " " + c.ping(3002));
    }
}
