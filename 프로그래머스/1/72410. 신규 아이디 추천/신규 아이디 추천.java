import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        String step1 = new_id.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<step1.length(); i++) {
            char c = step1.charAt(i);
            if (Character.isLetter(c) || 
                Character.isDigit(c) ||
                c == '.' ||
                c == '-' ||
                c == '_') {
                sb.append(c);
            }
        }
        String step2 = sb.toString();
        
        StringBuilder sb2 = new StringBuilder();
        for (int i=0; i<step2.length()-1; i++) {
            if (step2.charAt(i+1) != '.') {
               sb2.append(step2.charAt(i));
            } else if (step2.charAt(i) != '.') {
                sb2.append(step2.charAt(i));
            }
        }
        if (!step2.endsWith(".")) {
            sb2.append(step2.charAt(step2.length()-1));
        }
        String step3 = sb2.toString();
        
        String step4 = step3;
        if (step3.startsWith(".")) {
            step4 = step3.substring(1);
        }
        if (step4.endsWith(".")) {
            step4 = step4.substring(0, step4.length()-1);
        }
        
        String step5 = "";
        if (step4.isEmpty()) {
            step5 = "a";
        } else {
            step5 = step4;
        }
        
        String step6 = "";
        if (step5.length() >= 16) {
            step6 = step5.substring(0, 15);
            while (step6.endsWith(".")) {
                step6 = step6.substring(0, step6.length()-1);
            }
        } else {
            step6 = step5;
        }
        
        String step7 = "";
        StringBuilder sb3 = new StringBuilder(step6);
        while (sb3.length() <= 2) {
            sb3.append(sb3.charAt(sb3.length()-1));
        }
        step7 = sb3.toString();
        return answer = step7;
    }
}