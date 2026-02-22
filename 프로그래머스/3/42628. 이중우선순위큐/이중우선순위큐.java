import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[]{0, 0};
        PriorityQueue<Integer> asc = new PriorityQueue<>();
        PriorityQueue<Integer> dsc = new PriorityQueue<>((a, b) -> b - a);
        
        for (String o : operations) {
            String[] splited = o.split(" ");
            String order = splited[0];
            String num = splited[1];
            
            switch (order) {
                case "I":
                    asc.offer(Integer.valueOf(num));
                    dsc.offer(Integer.valueOf(num));
                    break;
                case "D":
                    if (num.equals("1") && !dsc.isEmpty()) {
                        int e = dsc.poll();
                        asc.remove(e);
                        break;
                    } else if (num.equals("-1") && !asc.isEmpty()) {
                        int e = asc.poll();
                        dsc.remove(e);
                        break;
                    }
            }
        }
        
        if (!asc.isEmpty() && ! dsc.isEmpty()) {
            answer[0] = dsc.peek();
            answer[1] = asc.peek();
        }
        return answer;
    }
}