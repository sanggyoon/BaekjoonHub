class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        double[] roundPoint = new double[3];
        int round = 0;
        double point = 0;

        for (int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (i==0 && !Character.isLetter(c)) {
                if (c - '0' == 1 && 
                    dartResult.charAt(i+1) - '0' == 0) {
                    point = 10;
                    i++;
                } else if (Character.isDigit(c)) {
                    point = c - '0';
                }
            } else if (Character.isDigit(c)) {
                roundPoint[round] = point;
                round++;
                if (c - '0' == 1 && 
                    dartResult.charAt(i+1) - '0' == 0) {
                    point = 10;
                    i++;
                } else if (Character.isDigit(c)) {
                    point = c - '0';
                }
            }

 
            switch (c) {
                case 'S':
                    break;
                case 'D':
                    point = Math.pow(point, 2);
                    break;
                case 'T':
                    point = Math.pow(point, 3);
                    break;
                case '*':
                    point *= 2;
                    if (round > 0) {
                        roundPoint[round-1] *= 2;
                    } 
                    break;
                case '#':
                    point *= (-1);
                    break;
                }
            
        }

        roundPoint[round] = point;
        for (double n : roundPoint) answer += n;
        return answer;
    }
}