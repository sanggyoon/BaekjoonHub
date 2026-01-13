class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[][] Ncounter = new int[10][2];
        
        for (int i=0; i<X.length(); i++) {
            Ncounter[X.charAt(i)-'0'][0]++;
        }
        
        for (int j=0; j<Y.length(); j++) {
            Ncounter[Y.charAt(j)-'0'][1]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int k=9; k>=0; k--) {
            int n = Math.min(Ncounter[k][0], Ncounter[k][1]);
            for (int i=0; i<n; i++) {
                sb.append(String.valueOf(k));
            }
        }
        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";
        return answer = sb.toString();
    }
}