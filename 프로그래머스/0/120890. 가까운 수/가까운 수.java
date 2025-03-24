class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int dif = Math.abs(array[0]-n);
        
        for (int i=1; i<array.length; i++){
            if (dif > Math.abs(array[i] - n)){
                dif = Math.abs(array[i] - n);
                answer = array[i];
            } else if (dif == Math.abs(array[i] -n) && (answer > array[i])){
                answer = array[i];
            }
        }
        return answer;
    }
}