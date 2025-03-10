class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String stick_string = String.valueOf(a) + String.valueOf(b);
        int stick_int = Integer.parseInt(stick_string);
        
        answer = Math.max(stick_int, (2*a*b));
        return answer;
    }
}