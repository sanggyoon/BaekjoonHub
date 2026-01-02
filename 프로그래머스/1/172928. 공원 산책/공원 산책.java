import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        char[][] map = new char[park.length][park[0].length()];
        
        // 2차원 배열 지도 만들기
        for (int i=0; i<park.length; i++) {
            for (int j=0; j<park[0].length(); j++) {
                map[i][j] = park[i].charAt(j);
                
                // 현재 위치 탐색
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        // 이동
        for (int k=0; k<routes.length; k++) {
            if (routes[k].charAt(0) == 'E') {
                int distant = 0;
                boolean canMove = true;
                for (int m=0; m<routes[k].charAt(2)-'0'; m++) {
                    if (answer[1]+1+m < map[0].length && map[answer[0]][answer[1]+1+m] != 'X') {
                        distant++;
                    } else {
                        canMove = false;
                        break;
                    }
                }
                if (canMove) {
                    answer[1] += distant;
                }
            } else if (routes[k].charAt(0) == 'W') {
                int distant = 0;
                boolean canMove = true;
                for (int m=0; m<routes[k].charAt(2)-'0'; m++) {
                    if (answer[1]-(1+m) >= 0 && map[answer[0]][answer[1]-(1+m)] != 'X') {
                        distant--;
                    } else {
                        canMove = false;
                        break;
                    }
                }
                if (canMove) {
                    answer[1] += distant;
                }
            } else if (routes[k].charAt(0) == 'S') {
                int distant = 0;
                boolean canMove = true;
                for (int m=0; m<routes[k].charAt(2)-'0'; m++) {
                    if (answer[0]+1+m < map.length && map[answer[0]+1+m][answer[1]] != 'X') {
                        distant++;
                    } else {
                        canMove = false;
                        break;
                    }
                }
                if (canMove) {
                    answer[0] += distant;
                }
            } else if (routes[k].charAt(0) == 'N') {
                int distant = 0;
                boolean canMove = true;
                for (int m=0; m<routes[k].charAt(2)-'0'; m++) {
                    if (answer[0]-(1+m) >= 0 && map[answer[0]-(1+m)][answer[1]] != 'X') {
                        distant--;
                    } else {
                        canMove = false;
                        break;
                    }
                }
                if (canMove) {
                    answer[0] += distant;
                }
            }
        }
        
        
        return answer;
    }
}