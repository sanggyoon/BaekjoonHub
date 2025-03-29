class Solution {
    public String[] solution(String my_str, int n) {
        int count = (my_str.length() + n -1 ) / n;    
        String[] answer = new String[count];
        
        for (int i=0; i<count; i++){
            answer[i] = my_str.substring(i * n, Math.min(my_str.length(), i * n + n));
        }
        
        return answer;
    }
}