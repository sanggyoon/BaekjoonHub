class Solution {
    public String solution(String phone_number) {
        
        char[] phoneArr = phone_number.toCharArray();
        for (int i=0; i<phoneArr.length-4; i++){
            phoneArr[i] = '*';
        }
        
        String answer = new String(phoneArr);
        return answer;
    }
}