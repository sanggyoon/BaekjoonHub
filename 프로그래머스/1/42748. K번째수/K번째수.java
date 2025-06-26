import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        
        for (int[] command : commands){
            int[] separated = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(separated);
            answer[index] = separated[command[2]-1];
            index++;
        }
        
        return answer;
    }
}