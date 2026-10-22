import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int row = maps.length;
        int col = maps[0].length;
        int[][] visited = new int[row][col];
        Deque<int[]> que = new ArrayDeque<>();
        
        que.addLast(new int[]{0, 0});
        visited[0][0] = 1;  
        
        while (!que.isEmpty()) {
            int[] location = que.removeFirst();
            int y = location[0];
            int x = location[1];
            if (y == row-1 && x == col-1) return visited[y][x];
            bfs(maps, row, col, y, x, que, visited);
        }
        return -1;
    }
    
    public void bfs (int[][] maps, 
                    int row, 
                    int col, 
                    int y, 
                    int x, 
                    Deque<int[]> que,
                    int[][] visited) {
        
        if (y > 0 && maps[y-1][x] == 1 && visited[y-1][x] == 0) {
            visited[y-1][x] = visited[y][x]+1;
            que.addLast(new int[]{y-1,x});
        }
        if (x < col-1 && maps[y][x+1] == 1 && visited[y][x+1] == 0) {
            visited[y][x+1] = visited[y][x]+1;
            que.addLast(new int[]{y,x+1});
        }
        if (y < row-1 && maps[y+1][x] == 1 && visited[y+1][x] == 0) {
            visited[y+1][x] = visited[y][x]+1;
            que.addLast(new int[]{y+1,x});
        }
        if (x > 0 && maps[y][x-1] == 1 && visited[y][x-1] == 0) {
            visited[y][x-1] = visited[y][x]+1;
            que.addLast(new int[]{y,x-1});
        }
    }
}