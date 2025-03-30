class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "";
        
        for (int i=0; i<my_string.length(); i++){
            if (Character.isDigit(my_string.charAt(i))){
                temp += my_string.charAt(i);
            } else {
                if (!temp.isEmpty()){
                    answer += Integer.parseInt(temp);
                    temp = "";        
                }
                
            }
        }
        
        if (!temp.isEmpty()){
            answer += Integer.parseInt(temp);
        }
        return answer;
    }
}