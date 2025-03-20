import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=2; i<=n; i++){
            boolean isPrime = true;
            
            for (int j=2; j<i; j++){
                if (i%j == 0){
                    isPrime = false;
                }
            }
            
            if ((isPrime) && (n%i == 0)){
                list.add(i);
            }
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}