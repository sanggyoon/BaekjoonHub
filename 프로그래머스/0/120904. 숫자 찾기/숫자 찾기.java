class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String number = String.valueOf(num);
        
        for (int i=0; i<number.length(); i++){
            if (number.charAt(i)-'0' == k){
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}