class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] priorityArray = emergency.clone();
        
        for (int i=0; i<priorityArray.length; i++){
            for (int j=i+1; j<priorityArray.length; j++){
                if (priorityArray[i] < priorityArray[j]){
                    int temp = priorityArray[i];
                    priorityArray[i] = priorityArray[j];
                    priorityArray[j] = temp;
                }
            }
        }
        
        for (int i=0; i<emergency.length; i++){
            for (int j=0; j<priorityArray.length; j++){
                if (emergency[i] == priorityArray[j]){
                    answer[i] += j+1;
                }
            }
        }
        
        return answer;
    }
}