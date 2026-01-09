class Solution {
    public int solution(String s) {
        int answer = 0;
        char c = s.charAt(0);
        int Ccount = 1;
        int Ucount = 0;
        
        for (int i=1; i<s.length()-1; i++) {
            if (s.charAt(i) == c) {
                Ccount++;
            } else {
                Ucount++;
            }
            
            if (Ccount == Ucount) {
                answer++;
                Ccount = 0;
                Ucount = 0;
                c = s.charAt(i+1);
            }
        }
        return answer+1;
    }
}