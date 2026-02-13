import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[] used = new boolean[words.length];
        List<Integer> list = new ArrayList<>();
        dfs(begin, target, words, used, 0, list);
        int answer = words.length;
        if (list.isEmpty()) {
            return 0;
        } else {
            for (int n : list) {
                answer = Math.min(answer, n);
            }
        }
        return answer;
    }
    public void dfs(String begin, 
                   String target, 
                   String[] words, 
                   boolean[] used, 
                   int count,
                   List<Integer> list) {
        System.out.println("현재단어:"+begin+", 비교횟수:"+count);
        boolean[] newused = Arrays.copyOf(used, used.length);
        
        // 현재 단어가 target일때 비교횟수 리스트에 저장
        if (begin.equals(target)) {
            System.out.println("***target과 같음***");
            list.add(count);
        }
        
        for (int i=0; i<used.length; i++) {
            // 사용하지 않은 단어만 틀린 문자 개수 계산
            if (newused[i] == false) {
                int change = 0;
                for (int j=0; j<target.length(); j++) {
                    if (begin.charAt(j) != words[i].charAt(j)) change++;
                }
                // 틀린 문자 개수가 1일때만 재탐색
                System.out.println("현재단어:"+begin+", 비교단어:"+words[i]+", change:"+change);
                if (change == 1) {
                    newused[i] = true;
                    dfs(words[i], target, words, newused, count+1, list);
                    newused[i] = false;
                }
            }
        }
    }
}