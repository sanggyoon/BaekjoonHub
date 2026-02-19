import java.util.*;
class Solution {
    public int solution(int[][] rectangle, 
                        int characterX, 
                        int characterY, 
                        int itemX, 
                        int itemY) {
        characterX *= 2;
        characterY *= 2;
        itemX *= 2;
        itemY *= 2;
        
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[102][102];
        
        queue.offer(new int[]{characterX, characterY, 0}); 
        visited[characterX][characterY] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];
            
            if (x == itemX && y == itemY) {
                return dist/2;
            }
            
            int[] dx = {0, 0, 1, -1};
            int[] dy = {1, -1, 0, 0};
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if ((nx >= 0 && nx <= 102 && ny >= 0 && ny <= 102) 
                    && !visited[nx][ny] 
                    && edge(rectangle, nx, ny)) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dist + 1});
                }
            }
        }
        return -1;
    }
    
    public boolean edge(int[][] rectangle, int x, int y) {
        boolean isEdge = false;
        
        for (int[] r : rectangle) {
            int minX = r[0]*2;
            int minY = r[1]*2;
            int maxX = r[2]*2;
            int maxY = r[3]*2;
            
            if (minX < x && x < maxX && minY < y && y < maxY) {
                return false;
            }

            if (minX <= x && x <= maxX && (y == minY || y == maxY)) {
                isEdge = true;
            }
            if (minY <= y && y <= maxY && (x == minX || x == maxX)) {
                isEdge = true;
            }
        }
        return isEdge;
    }
}