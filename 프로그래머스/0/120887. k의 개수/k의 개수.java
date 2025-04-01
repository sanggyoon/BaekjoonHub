class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int n=i; n<=j; n++){
            String str = String.valueOf(n);
            String target = String.valueOf(k);
            
            while (str.contains(target)) {
                answer++;
                str = str.replaceFirst(target, "");
            }
        }
        return answer;
    }
}