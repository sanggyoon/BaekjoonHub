class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i=left; i<=right; i++){
            int count = 0;
            for (int ii=1; ii<=i; ii++){
                if (i % ii == 0){
                    count++;
                }
            }
            if (count % 2 == 0){
                answer += i;
            } else if (count % 2 == 1){
                answer -= i;
            } else {
                return 0;
            }
        }
        return answer;
    }
}