import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> hs = new HashSet<>(Arrays.asList(phone_book));
        for (String pb : phone_book) {
            for (int i=1; i<pb.length(); i++) {
                if (hs.contains(pb.substring(0, i))) return false;
            }
        }
        return answer;
    }
}