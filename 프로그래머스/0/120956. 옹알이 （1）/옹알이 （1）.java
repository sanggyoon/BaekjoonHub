class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] say = {"aya", "ye", "woo", "ma"};
        
        for (int i=0; i<babbling.length; i++){
            for (String b : say){
                babbling[i] = babbling[i].replaceAll(b, " ");
            }
        }
        
        for (int j=0; j<babbling.length; j++){
            if (babbling[j].replaceAll(" ", "").isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}