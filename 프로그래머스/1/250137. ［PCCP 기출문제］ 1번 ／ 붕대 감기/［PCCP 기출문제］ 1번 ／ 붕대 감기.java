class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int term = 0;
        int attackTurn = 0;
        
        for (int time = 0; time <= attacks[attacks.length-1][0]; time++){
            if (attacks[attackTurn][0] == time){
                term = 0;
                answer -= attacks[attackTurn][1];
                if (answer <= 0){
                    return -1;
                }
                if (attackTurn < attacks.length-1){
                    attackTurn++;
                }
            } else {
                answer += bandage[1];
                term++;
                if (term == bandage[0]){
                    answer += bandage[2];
                    term = 0;
                }
                if (answer > health){
                    answer = health;
                }
            }    
        }     
        return answer;
    }
}