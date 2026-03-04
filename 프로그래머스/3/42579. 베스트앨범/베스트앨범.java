import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int size = genres.length;
        //
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<size; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        //
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (a, b) -> map.get(b) - map.get(a)); 
        //
        List<Integer> result = new ArrayList<>();
        for (String key : keys) {
            List<int[]> list = new ArrayList<>();
            for (int i=0; i<size; i++) {
                if (genres[i].equals(key)) {
                    list.add(new int[]{plays[i], i});
                }
            }
            Collections.sort(list, (a, b) -> b[0] - a[0]);
            
            result.add(list.get(0)[1]);
            if (list.size() > 1) {
                result.add(list.get(1)[1]);
            }
        }
        //
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}