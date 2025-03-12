class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String num1 = "";
        String num2 = "";
        
        for (int num : num_list){
            if (num % 2 == 1){
                num1 += String.valueOf(num);
            } else if (num % 2 == 0){
                num2 += String.valueOf(num);
            }
        }
        return answer = Integer.parseInt(num1) + Integer.parseInt(num2);
    }
}