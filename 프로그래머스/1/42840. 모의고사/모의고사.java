import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 정답 개수 구하기
        int[] counts = {count(supo1, answers), count(supo2, answers), count(supo3, answers)};
        int max = Math.max(Math.max(count(supo1, answers), count(supo2, answers)), count(supo3, answers));
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<counts.length; i++){
            if (counts[i]==max){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    // 정답 개수 구하기 함수
    public int count(int[] supo, int[] answers){
        int count = 0;
        int size = supo.length;
        for (int i=0; i<answers.length; i++){
            if (supo[i%size] == answers[i]){
                count++;
            }
        }
        return count;
    }
}