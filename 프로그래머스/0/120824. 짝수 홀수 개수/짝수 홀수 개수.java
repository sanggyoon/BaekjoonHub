class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int addCount = 0;
        int evenCount = 0;
        
        for (int n : num_list){
            if (n%2 == 0){
                evenCount++;
            } else if (n%2 == 1){
                addCount++;
            }
        }
        answer[0] = evenCount;
        answer[1] = addCount;
        
        return answer;
    }
}