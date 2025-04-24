class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String number = String.valueOf(x);
        int sum = 0;
        
        for (int i=0; i<number.length(); i++){
            sum += number.charAt(i) - '0';
        }
        
        if (x % sum != 0){
            answer = false;
        }
        
        return answer;
    }
}