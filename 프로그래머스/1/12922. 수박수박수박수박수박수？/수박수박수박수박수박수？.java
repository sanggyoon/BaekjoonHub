class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int size = 1;
        for (int i=1; i<=n; i++){
            if (i%2 == 1){
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        return answer = sb.toString();
    }
}