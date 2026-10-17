import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int size = genres.length;
        HashMap<String, Integer> hm = new HashMap<>();
        
        // 장르별 총 플레이 수 구하기
        for (int i=0; i<size; i++) {
            hm.put(genres[i], hm.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        System.out.println("===== 장르별 플레이 합계 =====");
        for (String genr : hm.keySet()) {
            System.out.println(genr + ":" + hm.get(genr));
        }
        System.out.println("==================");
        
        // 정답 배열의 크기 선언
        List<Integer> list = new ArrayList<>();
        
        // 가장 많은 플레이수를 가진 것부터 계산하고 맵에서 제거
        while (!hm.isEmpty()) {
            String max_genre = "";
            int max_play = 0;
            
            
            for (String genr : hm.keySet()) {
                if (hm.get(genr) > max_play) {
                    max_genre = genr;
                    max_play = hm.get(genr);
                }
            }
            System.out.println("현재 선택된 장르:" + max_genre);
            int first = 0;
            int second = 0;
            int first_idx = -1;
            int second_idx = -1;
            
            for (int i=0; i<genres.length; i++) {
                if (genres[i].equals(max_genre)) {
                    if (plays[i] > first) {
                        second = first;
                        first = plays[i];
                        second_idx = first_idx;
                        first_idx = i;
                    } else if (plays[i] > second) {
                        second = plays[i];
                        second_idx = i;
                    }
                }
            }
            list.add(first_idx);
            if (second_idx != -1) list.add(second_idx);
            System.out.println("선택된 장르 삭제:" + max_genre);
            hm.remove(max_genre);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}