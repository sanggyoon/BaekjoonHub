class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            char move = rsp.charAt(i);
            if (move == '2') {
                answer.append('0');
            } else if (move == '0') {
                answer.append('5');
            } else if (move == '5') {
                answer.append('2');
            }
        }
        return answer.toString();
    }
}
