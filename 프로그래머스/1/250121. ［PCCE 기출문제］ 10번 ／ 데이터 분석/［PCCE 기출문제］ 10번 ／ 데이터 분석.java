import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 인덱스별 값 종류 맵핑
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        // 인트배열로 이루어진 리스트 생성
        List<int[]> list = new ArrayList<>();
        
        // ext가 val_ext보다 작은 값 리스트에 추가
        for (int[] d : data) {
            if (d[map.get(ext)] < val_ext) list.add(d);
        }
        
        // list를 sort_by 값 기준으로 오름차순 정렬
        Collections.sort(list, (a, b) ->
                         Integer.compare(a[map.get(sort_by)], b[map.get(sort_by)])
                        );
        
        // 리스트 -> 배열 형변환 
        int[][] answer = list.toArray(new int[list.size()][data[0].length]);
        return answer;
    }
}