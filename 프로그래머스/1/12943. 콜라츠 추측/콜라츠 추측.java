class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        while (num != 1){
            count++;
            if (num % 2 == 0){
                num /= 2;
            } else if (num % 2 == 1){
                num  *= 3;
                num += 1;
            } else if (count == 500 && num != 1){
                return -1;
            }
        }
        answer = count;
        return answer;
    }
}