import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 여분 리스트 생성
        List<Integer> reserveList = new ArrayList<>();
        for (int m : reserve) reserveList.add(m);
        
        // 잃어버린 사람 리스트 생성
        List<Integer> lostList = new ArrayList<>();
        for (int l : lost) lostList.add(l);
        
        Arrays.sort(reserve);
        for (int r : reserve) {
            if (lostList.contains(r)){
                lostList.remove(Integer.valueOf(r));
                reserveList.remove(Integer.valueOf(r));
            } 
        }
        
        for (int r : reserve) {
            if (reserveList.contains(r) && lostList.contains(r-1) ) {
                lostList.remove(Integer.valueOf(r-1));
                reserveList.remove(Integer.valueOf(r));
            } else if (reserveList.contains(r) && lostList.contains(r+1)) {
                lostList.remove(Integer.valueOf(r+1));
                reserveList.remove(Integer.valueOf(r));
            }
        }

        return answer = n - lostList.size();
    }
}