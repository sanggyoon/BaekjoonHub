import java.util.*;
class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        boolean[] visited = new boolean[dungeons.length];
        
        answer = dfs(0, k, dungeons, visited);
        return answer;
    }
    
    public int dfs(int depth, int currentK, int[][] dungeons, boolean[] visited) {
        int result = depth;
        
        for (int i=0; i<dungeons.length; i++) {
            if (visited[i] == false && currentK >= dungeons[i][0]) {            
                visited[i] = true;
                
                int count = dfs(depth+1, currentK - dungeons[i][1], dungeons, visited);
                result = Math.max(result, count);
                
                visited[i] = false;
            }
        }
        
        return result;
    }
}