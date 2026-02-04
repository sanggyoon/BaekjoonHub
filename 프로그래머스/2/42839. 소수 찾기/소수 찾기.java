import java.util.*;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        List<Character> list = new ArrayList<>();
        for (int i=0; i<numbers.length(); i++) {
            list.add(numbers.charAt(i));
        }
        
        dfs(list, "", set);
        
        answer = set.size();
        return answer;
    }
    
    public void dfs(List<Character> list, String str, Set<Integer> set) {

            String NEWstr = str;
            
            for (int i=0; i<list.size(); i++) {
                // 소수인지 확인
                char c = list.get(i);
                NEWstr += c;
                int num = Integer.valueOf(NEWstr);
                if (isPrime(num)) set.add(num);
                
                // 재귀
                list.remove(i);
                dfs(list, NEWstr, set);
                
                // 백트래킹
                list.add(i, c);
                NEWstr = NEWstr.substring(0, NEWstr.length()-1);
            }
        
    }
    
    public boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}