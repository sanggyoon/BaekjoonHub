class Solution {
    public int solution(int[][] signals) {
        int answer = -1;
        int q = signals.length;
        int[] size = new int[q];
        
        // 신호등마다 전체 싸이클 구하기
        for (int i=0; i<q; i++) {
            for (int j=0; j<3; j++) {
                size[i] += signals[i][j];
            }
        }
        
        // 전체 싸이클들의 최소 공배수 구하기 (검사 최대 시간 구하기)
        long max_multi = 1;
        for (int i=0; i<size.length; i++) {
            max_multi = lcm(size[i], max_multi);
        }
        
        // 정전 검사
        for (int i=1; i<=max_multi; i++) {
            boolean yellow = true;
            for (int[] signal : signals) {
                if (i % (signal[0]+signal[1]+signal[2]) <= signal[0] ||
                   i % (signal[0]+signal[1]+signal[2]) > signal[0]+signal[1]) {
                    yellow = false;
                    break;
                }
            }
            if (yellow) return i;
        }
        return answer;
    }
    
    
    public long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}