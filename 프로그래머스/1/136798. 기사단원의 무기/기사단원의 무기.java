class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int knight = 1; knight<=number; knight++){
            int point = countDivisor(knight);
            
            if (point > limit){
                answer += power;
            } else {
                answer += point;
            }
        }
        return answer;
    }
    
    private int countDivisor(int num){
        int count = 0;
        for (int i = 1; i*i <= num; i++){
            if (num % i == 0){
                count++;
                if (i != num/i){
                    count++;
                }
            }
        }
        return count;
    }
}