import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int h = maps.length;
        int w = maps[0].length;
        
        int answer = bfs(maps, h, w);
        return answer;
    }

    public int bfs(int[][] maps, int h, int w) {
        int distant[][] = new int[h][w];
        int[] moveX = {1, -1, 0, 0};
        int[] moveY = {0, 0, 1, -1};
        
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});
        distant[0][0] = 1;
        
        while (!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            
            if (x == h-1 && y == w-1) return distant[x][y];
            
            for (int i=0; i<4; i++){
                int nx = x + moveX[i];
                int ny = y + moveY[i];
                
                if (nx >= h || ny >= w || nx < 0 || ny < 0) continue;
                if (maps[nx][ny] == 0 || distant[nx][ny] != 0) continue;
                
                distant[nx][ny] = distant[x][y] + 1;
                q.offer(new int[]{nx, ny});
            }
        }
        return -1;
    }
}