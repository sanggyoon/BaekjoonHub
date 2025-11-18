class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int Psize = progresses.length;
        int[] terms = new int[Psize];
        
        // 요소마다 걸리는 기간 구하기
        for (int i=0; i<Psize; i++){
            int left = 100 - progresses[i];
            int term = 0;
            if (left%speeds[i] == 0){
                term = left/speeds[i];
            } else {
                term = left/speeds[i] + 1;
            }
            terms[i] = term;
        }
        
        // retrun의 개수 구하기
        int max = 0;
        int Asize = 0;
        for (int j=0; j<terms.length; j++){
            if (terms[j] > max){
                max = terms[j];
                Asize++;
            }
        }
        
        // 스택 ex) [5, 10, 1, 1, 20, 1]
        int[] answer = new int[Asize];
        int index = 0;
        int maxterm = terms[0];
        int count = 0;
        for (int k=0; k<terms.length; k++){
            if (terms[k] <= maxterm){
                count++;
            } else {
                answer[index] = count;
                index++;
                count = 1;
                maxterm = terms[k];
            }
        }
        answer[index] = count;
            
        return answer;
    }
}