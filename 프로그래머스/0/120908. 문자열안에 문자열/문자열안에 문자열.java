class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        int str1_size = str1.length();
        int str2_size = str2.length();
        
        for (int i=0; i<=str1_size - str2_size; i++){
            if(str1.substring(i, i+str2_size).equals(str2)){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}