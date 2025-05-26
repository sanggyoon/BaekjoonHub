class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int box = num;
        while (box <= n){
            answer++;
            box += 2*(w-((box-1)%w))-1;
        }
        return answer;
    }
}