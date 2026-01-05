class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        int minW = wallpaper[0].length() + 1;
        int maxW = 0;
        int minH = wallpaper.length + 1;
        int maxH = 0;
        
        for (int i=0; i<wallpaper.length; i++) {
            for (int j=0; j<wallpaper[0].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (i < minH) minH = i;
                    if (i >= maxH) maxH = i+1;
                    if (j < minW) minW = j;
                    if (j >= maxW) maxW = j+1;
                }
            }
        }
        
        answer[0] = minH;
        answer[1] = minW;
        answer[2] = maxH;
        answer[3] = maxW;
        
        return answer;
    }
}