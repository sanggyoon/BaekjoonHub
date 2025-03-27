class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int q=0; q<quiz.length; q++){
            String[] token = quiz[q].split(" ");
            int temp_answer = 0;
            boolean isPlus = true;
            
            for (int i=0; i<token.length-2; i++){
                String t = token[i];
                
                if (t.equals("+")){
                    isPlus = true;
                } else if (t.equals("-")){
                    isPlus = false;
                } else if (t.matches("-?\\d+")){
                    int number = Integer.parseInt(t);
                    temp_answer += isPlus ? number : -number;
                }
            }
            
            if (Integer.parseInt(token[token.length-1]) == temp_answer){
                answer[q] = "O";
            } else {
                answer[q] = "X";
            }
        }
        
        return answer;
    }
}