class Solution {
    public int[] solution(int n) {
        int size = (n+1)/2;
        int count = 0;
        int[] answer = new int[size];
        for (int i=1; i<n+1; i++){
            if ((i%2)==1){
                answer[count] = i;
                count++;
            }
        }
        return answer;
    }
}