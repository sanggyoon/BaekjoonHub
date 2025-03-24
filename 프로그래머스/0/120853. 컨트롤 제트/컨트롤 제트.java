class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] s_array = s.split(" ");
        
        for (int i=0; i<s_array.length; i++){
            if (s_array[i].equals("Z")){
                answer -= Integer.parseInt(s_array[i-1]);
            } else {
                answer += Integer.parseInt(s_array[i]);
            }
        }
        return answer;
    }
}