import java.util.Arrays;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int maxLen = Math.max(bin1.length(), bin2.length());
        bin1 = String.format("%" + maxLen + "s", bin1).replace(' ', '0');
        bin2 = String.format("%" + maxLen + "s", bin2).replace(' ', '0');
        
        int[] temp = new int[bin1.length() + 1];
        
        for (int i=bin1.length()-1; i>=0; i--){
            int sum = bin1.charAt(i)-'0' + bin2.charAt(i)-'0' + temp[i+1];
            if (sum == 3){
                temp[i+1] = 1;
                temp[i] = 1;
            } else if (sum == 2){
                temp[i+1] = 0;
                temp[i] = 1;
            } else if (sum == 1){
                temp[i+1] = 1;
                temp[i] = 0;
            } else if (sum == 0){
                temp[i+1] = 0;
                temp[i] = 0;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int n : temp){
            sb.append(n);
        }
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}