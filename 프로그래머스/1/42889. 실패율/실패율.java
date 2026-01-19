import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        float[] failureRatio = new float[N];
        
        for (int i=0; i<N; i++) {
            int a = 0;
            int b = 0;
            for (int s : stages) {
                if (i+1 == s) {
                    a++;
                }
                if (i+1 <= s) {
                    b++;
                }
            }
            if ( b != 0) {
                failureRatio[i] = (float) a / b;
            } else {
                failureRatio[i] = 0;
            }
        }
        
        Map<Integer, Float> map = new HashMap<>();
        int i = 1;
        for (float f : failureRatio) {
            map.put(i, f);
            i++;
        }
        
        List<Integer> answerList = new ArrayList<>(map.keySet());
        Collections.sort(answerList, (a, b) -> {
            int compare = map.get(b).compareTo(map.get(a));
            if (compare == 0) {
                return a - b;
            } else {
                return map.get(b).compareTo(map.get(a));   
            }
        });
        return answer = answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}