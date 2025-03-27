class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] word = my_string.split(" ");
        boolean isSum = true;
            
        for(String s : word){
            if (s.equals("+")){
                isSum = true;
            } else if (s.equals("-")){
                isSum = false;
            }
            
            if (s.matches("-?\\d+")){
                int num = Integer.parseInt(s);
                answer += isSum ? num : -num;
            }
        }
        
        return answer;
    }
}