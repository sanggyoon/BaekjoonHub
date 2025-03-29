class Solution {
    public int solution(int n) {
        if (n == 1) return 0;
        
        int answer = 0;
        int[] number = new int[n+1];
        number[0] = 0;
        number[1] = 1;
        
        for (int i=2; i<=n; i++){
            number[i] = (number[i-1] + number[i-2])%1234567;
        }
        
        answer = number[n];
        
        return answer;
    }
}