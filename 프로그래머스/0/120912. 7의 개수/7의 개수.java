class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i=0; i<array.length; i++){
            String number = String.valueOf(array[i]);
            for (int j=0; j<number.length(); j++){
                if (number.charAt(j) == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}