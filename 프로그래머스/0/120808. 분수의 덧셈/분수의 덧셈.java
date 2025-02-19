class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[0] = numer1 * denom2 + numer2 * denom1;
        answer[1] = denom1 * denom2;
        int max = Math.max(answer[0], answer[1]);
        int gcf = 1;
        
        for (int i=2; i < max+1; i++){
            if (answer[0]%i == 0 && answer[1]%i == 0){
                gcf = i;
            }
        }
        answer[0] /= gcf;
        answer[1] /= gcf;
        
        return answer;
    }
}