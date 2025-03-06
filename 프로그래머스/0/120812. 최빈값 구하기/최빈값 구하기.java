class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;
        int[] countArray = new int[array.length];
        int dedication = 0;
        
        for (int i=0; i<array.length; i++){
            int countOf = 1;
            for (int j=i+1; j<array.length; j++){
                if (array[i] == array[j]){
                    countOf += 1;
                }
            }
            countArray[i] = countOf;
        }
        
        for (int i=0; i<countArray.length; i++){
            if (countArray[i] > maxCount){
                maxCount = countArray[i];
                answer = array[i];
            }
        }
        
        for (int i=0; i<countArray.length; i++){
            if (countArray[i] == maxCount){
                dedication += 1;
            }
        }
        
        if (dedication != 1){
            return -1;
        }
        
        return answer;
    }
}