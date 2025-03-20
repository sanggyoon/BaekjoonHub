class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        
        for (int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            boolean isVowel = false;
            
            for (char v : vowel){
                if (c == v){
                    isVowel = true;
                    break;
                }
            }
            
            if (!isVowel){
                answer.append(c);
            }
        }
        return answer.toString();
    }
}