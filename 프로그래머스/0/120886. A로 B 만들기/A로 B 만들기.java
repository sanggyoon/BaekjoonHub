class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        if (before.length() == after.length()){
            for (int i=0; i<after.length( ); i++){
                char c = after.charAt(i);
                before = before.replaceFirst(String.valueOf(c), "");
            }
        }
        
        if (before.equals("")){
            answer = 1;
        }
        
        return answer;
    }
}