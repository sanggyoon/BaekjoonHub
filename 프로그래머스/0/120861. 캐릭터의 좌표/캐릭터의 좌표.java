class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int size = board.length;
        
        for (String way : keyinput){
            if (way.equals("up") && answer[1] < board[1] / 2){
                answer[1] += 1;
            } else if (way.equals("down") && answer[1] > -board[1] / 2){
                answer[1] -= 1;
            } else if (way.equals("left") && answer[0] > -board[0] / 2){
                answer[0] -= 1;
            } else if (way.equals("right") && answer[0] < board[0] / 2){
                answer[0] += 1;
            }
        }
        
        return answer;
    }
}