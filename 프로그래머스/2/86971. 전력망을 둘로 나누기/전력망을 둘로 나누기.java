import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        List<int[]> list = new ArrayList<>();
        for (int i=0; i<wires.length; i++) {
            list.add(wires[i]);
        }
        
        // 연결 하나씩 끊어보기
        for (int i=0; i<list.size(); i++) {
            boolean[] linkedNode = new boolean[n+1];
            
            int[] temp = list.get(i);
            list.remove(temp);
            
            // 리스트와 연결된 노드 검사
            int totalCount = nodeCounter (list, linkedNode, list.get(0)[0]);
            answer = Math.min(answer, Math.abs(totalCount*2 - n));
                
            list.add(i, temp);
        }
        return answer;
    }
    
    // 연결된 노드 개수 카운터
    public int nodeCounter (List<int[]> list, 
                            boolean[] linkedNode, 
                            int nodeNumber) {
        if (linkedNode[nodeNumber] == false) {
            linkedNode[nodeNumber] = true;
        }
        int c = 1;
        
        for (int[] arr : list) {
            if (arr[0] == nodeNumber && linkedNode[arr[1]] == false ) {
                c += nodeCounter(list, linkedNode, arr[1]);
            } else if (arr[1] == nodeNumber && linkedNode[arr[0]] == false) {
                c += nodeCounter(list, linkedNode, arr[0]);
            }
        }
            
        return c;
    }
}