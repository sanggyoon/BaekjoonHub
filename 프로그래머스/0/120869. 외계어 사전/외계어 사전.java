import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        String sortedSpell = "";
        
        Arrays.sort(spell);
        
        for (String ch : spell){
            sortedSpell += ch;
        }
        
        for (String word : dic){
            char[] chArray = word.toCharArray();
            Arrays.sort(chArray);
            String str = new String(chArray);
            
            if (sortedSpell.equals(str)){
                return 1;
            }
        }
        
        return answer;
    }
}