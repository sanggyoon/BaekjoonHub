class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for (String s1_e : s1){
            for (String s2_e : s2){
                if (s1_e.equals(s2_e)){
                    answer++;
                }
            }
        }
        return answer;
    }
}