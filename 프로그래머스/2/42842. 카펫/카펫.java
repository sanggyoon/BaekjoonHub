class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int yellow_height = 0;
        int yellow_width = 0;
        // yellow_height * yellow_width = yellow
        // yellow_height * 2 + yellow_width * 2 + 4 = brown
        // 곱했을 떄 yellow, (더했을 땐 brown-4)/2
        
        for (int i=1; i<=brown/2; i++) {
            if (yellow % i == 0) {
                int n = yellow / i;
                if (n + i == (brown-4)/2) {
                    answer[0] = n+2;
                    answer[1] = i+2;
                    break;
                }
            } 
        }
        return answer;
    }
}