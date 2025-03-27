import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : numlist){
            if (num % n == 0){
                list.add(num);
            }
        }
        
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}