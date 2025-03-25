class Solution {
    public int solution(int order) {
        int answer = 0;
        String s_order = String.valueOf(order);
        for (int i=0; i<s_order.length(); i++){
            if (s_order.charAt(i)=='3' ||
                s_order.charAt(i)=='6' || 
                s_order.charAt(i)=='9'){
                answer ++;
            }
        }
        return answer;
    }
}