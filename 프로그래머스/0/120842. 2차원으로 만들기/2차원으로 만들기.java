class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int i = 0;
        for (int j=0; j<num_list.length/n; j++){
            for (int k=0; k<n; k++){
                answer[j][k] = num_list[i];
                i++;
            }
        }
        return answer;
    }
}