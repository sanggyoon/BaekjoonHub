import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        String[] sArr = new String[numbers.length];
        for (int i=0; i<numbers.length; i++){
            sArr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(sArr, (a, b) -> (b + a).compareTo(a + b));
        if (sArr[0].equals("0")) return "0";
        for (String s : sArr) sb.append(s);
        return answer = sb.toString();
    }
}