import java.util.*;
class Solution {
    int[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new int[n];
        
        for (int i=0; i<n; i++) {
            if (visited[i] == 0) {
                dfs(n, computers, i, visited);
                answer++;
            }
        }
        // 일단 여기서 1로 채워진 배열이 나와야함.
        // System.out.println(Arrays.toString(visited));
        return answer;
    }
    
    public void dfs (int n, int[][] computers, int node, int[] visited) {
        visited[node] = 1;
        for (int i=0; i<n; i++) {
            if (i != node && visited[i] == 0 && computers[node][i] == 1) {
                dfs (n, computers, i, visited);
            }
        }
    }
}