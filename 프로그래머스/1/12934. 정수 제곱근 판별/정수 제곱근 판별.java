class Solution {
    public long solution(long n) {
        long answer = 0;
        for (long i=1; i<10000000; i++){
            if (i*i == n){
                answer = (i+1)*(i+1);
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}