class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        double n1_A = (double)(dots[1][1] - dots[0][1])/(dots[1][0] - dots[0][0]);
        double n1_B = (double)(dots[3][1] - dots[2][1])/(dots[3][0] - dots[2][0]);
        
        double n2_A = (double)(dots[2][1] - dots[0][1])/(dots[2][0] - dots[0][0]);
        double n2_B = (double)(dots[3][1] - dots[1][1])/(dots[3][0] - dots[1][0]);
        
        double n3_A = (double)(dots[3][1] - dots[0][1])/(dots[3][0] - dots[0][0]);
        double n3_B = (double)(dots[2][1] - dots[1][1])/(dots[2][0] - dots[1][0]);
        
        if (n1_A == n1_B || n2_A == n2_B || n3_A == n3_B){
            answer = 1;
        }
        
        return answer;
    }
}