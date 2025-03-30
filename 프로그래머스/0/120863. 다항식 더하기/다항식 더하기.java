class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] token = polynomial.split(" ");
        int x_coefficient = 0;
        int nomal_integer = 0;
        
        for (String text : token){
            if (text.endsWith("x")){
                text = text.replace("x", "");
                x_coefficient += text.isEmpty() ? 1 : Integer.parseInt(text);
            } else if (text.matches("-?\\d+")){
                nomal_integer += Integer.parseInt(text);
            }
        }
        
        if (x_coefficient != 0 && nomal_integer != 0) {
            answer = (x_coefficient == 1 ? "x" : x_coefficient + "x") + " + " + nomal_integer;
        } else if (x_coefficient != 0) {
            answer = x_coefficient == 1 ? "x" : x_coefficient + "x";
        } else {
            answer = String.valueOf(nomal_integer);
        }
        
        return answer;
    }
}