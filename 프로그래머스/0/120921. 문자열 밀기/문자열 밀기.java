class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String Change = A;
        while (!Change.equals(B)) {
            Change = pushText(Change);
            answer++;
            if (answer > A.length()){
                return -1;
            }
        }
        return answer;
    }
    public String pushText(String A){
        StringBuilder sb = new StringBuilder();
        
        sb.append(A.charAt(A.length()-1));
        for (int i=0; i<A.length()-1; i++) {
            sb.append(A.charAt(i));
        }
        
        return sb.toString();
    }
}