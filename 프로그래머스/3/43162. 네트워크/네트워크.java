import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] connected = new boolean[n];
        for (int i=0; i<n; i++) {
            if (connected[i] == false) {
                System.out.println("독립된 노드 탐색 시작==============");
                dfs(i, computers, connected);
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int idx, int[][] computers, boolean[] connected) {
        System.out.println(idx + " 노드 탐색 시작");
        connected[idx] = true;
        for (int i=0; i<computers.length; i++) {
            if (idx != i && connected[i] == false && computers[idx][i] == 1) {
                System.out.println(idx + "-" + i + " 연결 노드 확인, 네트워크 개수 수정");
                dfs(i, computers, connected);
            }
        }
    }
}