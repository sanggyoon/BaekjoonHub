import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i=food.length - 1; i>=0; i--){
            for (int j=1; j<=food[i]/2; j++){
                sb.append(i);
            }
        }
        answer.append(sb.reverse().toString());
        answer.append("0");
        answer.append(sb.reverse().toString());
        return answer.toString();
    }
}