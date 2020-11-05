package Day08;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author:付文杰
 * @date :2020/11/5 21:51
 */
public class _542_01矩阵 {
    int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] res = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        int cost = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int s = 0; s < size; s++) {
                int[] cur = queue.poll();
                int i = cur[0], j = cur[1];
                if (matrix[i][j] == 1) {
                    res[i][j] = cost;
                }
                for (int[] dir : dirs) {
                    int x = i + dir[0], y = j + dir[1];
                    if (x >= 0 && x < m && y >= 0 && y < n && !visited[x][y]) {
                        queue.offer(new int[]{x, y});
                        visited[x][y] = true;
                    }
                }
                cost++;
            }
        }
        return res;
    }
}
