class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int size = board.length;
        int[][] expandBoard = new int[size+2][size+2];
        
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                expandBoard[i+1][j+1] = board[i][j];    
            }
        }
        
        for (int i=1; i<=size; i++){
            for (int j=1; j<=size; j++){
                if ((expandBoard[i][j] != 1) && 
                    (expandBoard[i+1][j] != 1) && 
                    (expandBoard[i-1][j] != 1) && 
                    (expandBoard[i][j+1] != 1) && 
                    (expandBoard[i][j-1] != 1) && 
                    (expandBoard[i+1][j+1] != 1) &&
                    (expandBoard[i-1][j+1] != 1) &&
                    (expandBoard[i+1][j-1] != 1) &&
                    (expandBoard[i-1][j-1] != 1)
                   ){
                    answer++;
                } 
            }
        }
        return answer;
    }
}