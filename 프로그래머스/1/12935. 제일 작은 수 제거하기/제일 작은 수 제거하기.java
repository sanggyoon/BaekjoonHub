import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
            list.add(n);
        }
        
        int min = arr[0];
        int minIndex = 0;
        
        for (int i=0; i<arr.length; i++){
            if (min > list.get(i)){
                min = arr[i];
                minIndex = i;
            }
        }
        
        list.remove(minIndex);
        if (list.size() == 0){
            list.add(-1);
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;    
        
    }
}