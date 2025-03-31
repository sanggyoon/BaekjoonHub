class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int minPoint = lines[0][0];
        int maxPoint = lines[0][1];
        
        for (int i=0; i<lines.length; i++){
            if (minPoint > lines[i][0]){
                minPoint = lines[i][0];
            }
            if (maxPoint < lines[i][1]){
                maxPoint = lines[i][1];
            }
        }
        
        for (int i=0; i<lines.length; i++){
            lines[i][0] -= minPoint;
            lines[i][1] -= minPoint;
        }
        
        int[] width = new int[maxPoint-minPoint+1];
        for (int point=0; point<width.length; point++){
            for (int[] line : lines){
                if (point >= line[0] && point < line[1]){
                    width[point]++;
                }
            }
        }
        
        for (int i=0; i<width.length; i++){
            if (width[i] > 1){
                answer++;
            }
        }
        
        return answer;
    }
}