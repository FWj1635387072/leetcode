package Day06;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author:付文杰
 * @date :2020/11/3 17:18
 */
class _933_最近的请求数 {

}

class RecentCounter {

    private Queue<Integer> q;

    public RecentCounter() {

        q = new LinkedList();
    }


    public int ping(int t) {
        q.offer(t);
        while (q.peek() < t - 3000)
            q.poll();
        return q.size();
    }
}