import java.util.ArrayList;

class Solution {
    public String solution(String my_string) {
        ArrayList<Character> answer = new ArrayList<>();
        
        for (int i=0; i<my_string.length(); i++){
            boolean exist = false;
            
            for (int j=0; j<answer.size(); j++){
                if (my_string.charAt(i) == answer.get(j)){
                    exist = true;
                    break;
                }
            }
            
            if (!exist){
                answer.add(my_string.charAt(i));
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : answer) {
            result.append(c);
        }
        
        return result.toString();
    }
}