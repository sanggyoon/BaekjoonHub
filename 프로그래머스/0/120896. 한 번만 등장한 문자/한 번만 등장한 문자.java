class Solution {
    public String solution(String s) {
        String answer = "";
        int[] frequence = new int[26];
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()){
            frequence[c - 'a']++;
        }
        
        for (int i=0; i<26; i++){
            if (frequence[i] == 1){
                sb.append((char)(i+'a'));
            }
        }
        return answer = sb.toString();
    }
}