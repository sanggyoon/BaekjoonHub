class Solution {
    public String solution(int age) {
        String[] age962 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String answer = "";
        String age_string = "";
        
        age_string = String.valueOf(age);
        for (int i=0; i<age_string.length(); i++){
            answer += age962[age_string.charAt(i)-'0'];
        }
        return answer;
    }
}