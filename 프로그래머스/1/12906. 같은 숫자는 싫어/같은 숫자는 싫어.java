import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] != arr[i+1]){
                list.add(arr[i]);
            }
        }
       
            list.add(arr[arr.length-1]);
        
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}