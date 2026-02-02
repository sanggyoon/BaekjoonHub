import java.util.*;
class Solution {
    public int solution(String word) {
        int answer = 1;
        char[] a = {' ', 'A', 'E', 'I', 'O', 'U'};
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<a.length; i++) {
            map.put(a[i], i);
        }
        
        char[] w = {'A', ' ', ' ', ' ', ' '};
        
        while (!String.valueOf(w).replace(" ", "").equals(word)) {
            int idx = 4;
            dfs(a, w, idx, map);
            answer++;
        }
        return answer;
    }
    
    public void dfs(char[] a, char[] w, int idx, Map<Character, Integer> map) {
        if (idx > 0) {
            if (map.get(w[idx]) != 0 && map.get(w[idx]) != 5) {
                w[idx] = a[map.get(w[idx]) + 1];
            } else if (map.get(w[idx]) == 0 && map.get(w[idx-1]) != 0) {
                w[idx] = a[map.get(w[idx]) + 1];
            } else if (map.get(w[idx]) == 0 && map.get(w[idx-1]) == 0) {
                dfs(a, w, idx-1, map); 
            } else if (map.get(w[idx]) == 5) {
                w[idx] = ' ';
                dfs(a, w, idx-1, map);
            }
        } else if (idx == 0 && w[idx] != 'U') {
            w[idx] = a[map.get(w[idx]) + 1];
        }
    }
}