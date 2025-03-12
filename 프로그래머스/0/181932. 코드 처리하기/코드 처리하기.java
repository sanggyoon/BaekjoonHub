class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        
        for (int i=0; i<code.length(); i++){
            if (code.charAt(i)=='1'){
                mode = !mode;
            } else if ((!mode)&&(i%2==0)){
                answer += code.charAt(i);
            } else if ((mode)&&(i%2==1)){
                answer += code.charAt(i);
            }
        }
        return answer = answer.length()==0 ? "EMPTY" : answer.toString();
    }
}