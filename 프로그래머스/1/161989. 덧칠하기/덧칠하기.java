class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] isPainted = new boolean[n];
        
        for (int wall : section) {
            if (!isPainted[wall-1]) {
                answer++;
                for (int i=wall-1; i<wall-1+m ; i++) {
                    if (i < n) isPainted[i] = true;
                }
            }
        }
        return answer;
    }
}