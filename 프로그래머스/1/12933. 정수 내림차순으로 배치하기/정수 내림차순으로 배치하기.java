import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        
        Arrays.sort(ch);

        StringBuilder sb = new StringBuilder(new String(ch));
        sb.reverse();
        
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}