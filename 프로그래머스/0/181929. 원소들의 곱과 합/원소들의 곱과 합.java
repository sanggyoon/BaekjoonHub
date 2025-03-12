class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int sumPow = 0;
        
        for (int num : num_list){
            multi *= num;
            sumPow += num;
        }
        sumPow *= sumPow;
        
        if (multi < sumPow){
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}