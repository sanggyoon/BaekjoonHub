class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        for (int i=0; i<num; i++){
            answer[i] = i-((num-1)/2);
        }
        
        while (sum(answer) != total){
            for (int i=0; i<num; i++){
                answer[i] += 1;
            }
        }
        
        return answer;
    }
    
    public int sum(int[] intArr) {
        int result = 0;
        
        for (int i=0; i<intArr.length; i++){
            result += intArr[i];
        }
        
        return result;
    }
}