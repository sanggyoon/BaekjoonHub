import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0; i<numbers.length; i++){
            for (int j=i+1; j<numbers.length; j++){
                al.add(numbers[i] + numbers[j]);
            }
        }
        Collections.sort(al);
        int[] answer = al.stream().mapToInt(i -> i).toArray();
        answer = Arrays.stream(answer).distinct().toArray();
        return answer;
    }
}