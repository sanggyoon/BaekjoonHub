class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] answer_chArr = my_string.toCharArray();
        
        char temp = answer_chArr[num1];
        answer_chArr[num1] = answer_chArr[num2];
        answer_chArr[num2] = temp;
        
        return answer = new String(answer_chArr);
    }
}