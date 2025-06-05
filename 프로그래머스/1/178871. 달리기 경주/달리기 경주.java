import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        for (int j=0; j<callings.length; j++){
            int rank = map.get(callings[j]);
            String frontPlayer = players[rank-1];
            
            players[rank-1] = players[rank];
            players[rank] = frontPlayer;
            
            map.put(callings[j], rank-1);
            map.put(frontPlayer, rank);
        }
        
        return players;
    }
}