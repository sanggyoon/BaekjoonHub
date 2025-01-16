class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        for (int i=0; i<mats.length; i++){
            int range = mats[i]+1;
            int scale = mats[i];
            
            for (int j=0; j<park.length-scale+1; j++){
                for (int k=0; k<park[j].length-scale+1; k++){
                    
                    int count = 0;
                    String[][] slicedArr = new String[scale][scale];            
                    
                    for (int row = 0; row < scale; row++) {
                        for (int col = 0; col < scale; col++) {
                            slicedArr[row][col] = park[j + row][k + col]; 
                        }
                    }
                    
                    for (String[] row : slicedArr){
                        for (String col : row){
                            if (col.equals("-1")){
                                count++;
                            }
                        }
                    }
                    if (count == scale*scale){
                        answer = Math.max(answer, scale);
                    }
                }                
            }
        }
        return answer;
    }
}