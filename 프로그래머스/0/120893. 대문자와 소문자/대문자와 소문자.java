class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] ch = my_string.toCharArray();
        
        for (char c : ch){
            if (Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        
        return answer = sb.toString();
    }
}