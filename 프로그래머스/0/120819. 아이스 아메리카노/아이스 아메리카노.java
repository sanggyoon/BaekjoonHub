class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int count = 0;
        
        while (money >= 5500){
            money -= 5500;
            count += 1;
        }
        
        answer[0] = count;
        answer[1] = money;
        
        return answer;
    }
}