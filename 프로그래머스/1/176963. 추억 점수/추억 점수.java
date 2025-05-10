class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for (int i=0; i<photo.length; i++){
            for (int ii=0; ii<photo[i].length; ii++){
                for (int iii=0; iii<name.length; iii++){
                    if (name[iii].equals(photo[i][ii])){
                        answer[i] += yearning[iii];    
                    }
                }
            }
        }
        return answer;
    }
}