class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 1;
        while (num * answer < n){
            answer++;
            num *= answer;
        }
        return answer;
    }
}