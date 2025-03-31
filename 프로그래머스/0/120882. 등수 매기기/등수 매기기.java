class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        
        for (int n=0; n<score.length; n++){
            avg[n] = (score[n][0] + score[n][1]) / 2.0;
        }
        
        for (int i=0; i<score.length; i++){
            for (int j=0; j<score.length; j++){
                if (avg[i] > avg[j]){
                    answer[j]++;
                }
            }
        }
        
        for (int i=0; i<score.length; i++){
            answer[i]++;
        }
        
        return answer;
    }
}