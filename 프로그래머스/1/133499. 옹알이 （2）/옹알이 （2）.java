class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] say = {"aya", "ye", "woo", "ma"};
        for (String s1 : babbling) {
            boolean skip = false;
            
            for (String s2 : say) {
                if (s1.contains(s2 + s2)) {
                    skip = true;
                }
            } 
            
            if (skip) continue;
                
            while (s1.length() > 0) {
                boolean found = false;
                
                for (String s2 : say) {
                    if (s1.startsWith(s2)) {  // ← 핵심!
                        s1 = s1.substring(s2.length());  // 앞부분만 제거
                        found = true;
                        break;
                    }
                }
                
                if (!found) break;  // 앞에서 발음 못 찾으면 중단
            }
            if (s1.equals("")) answer++;
        }
        return answer;
    }
}