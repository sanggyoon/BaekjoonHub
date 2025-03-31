import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<int[]> diffList = new ArrayList<>();

        for (int num : numlist) {
            int diff = Math.abs(num - n);
            diffList.add(new int[]{num, diff});
        }

        Collections.sort(diffList, (a, b) -> {
            if (a[1] == b[1]) {
                return b[0] - a[0]; 
            }
            return a[1] - b[1]; 
        });
        
        int[] answer = new int[numlist.length];
        for (int i = 0; i < diffList.size(); i++) {
            answer[i] = diffList.get(i)[0];
        }

        return answer;
    }
}
