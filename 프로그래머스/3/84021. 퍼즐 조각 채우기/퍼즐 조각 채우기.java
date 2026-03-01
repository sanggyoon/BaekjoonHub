import java.util.*;
class Solution {
    public int solution(int[][] game_board, int[][] table) {
        int answer = 0;
        int size = table.length;
        boolean[][] g_visited = new boolean[size][size];
        boolean[][] t_visited = new boolean[size][size];
        
        List<int[][]> game_board_d = new ArrayList<>();
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                if (game_board[i][j] == 0 && g_visited[i][j] == false) {
                    game_board_d.add(findDiagram(game_board, i, j, 0, g_visited));
                }
            }
        }
        
        List<int[][]> table_d = new ArrayList<>();
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                if (table[i][j] == 1 && t_visited[i][j] == false) {
                    table_d.add(findDiagram(table, i, j, 1, t_visited));
                }
            }
        }
        
        // game_table_d와 table_d + 회전 비교해서 채워진 개수만큼 answer++
        boolean[] used = new boolean[table_d.size()];

        for (int[][] board : game_board_d) {
            for (int t = 0; t < table_d.size(); t++) {
                if (used[t]) continue;
                int[][] cur = table_d.get(t);
                boolean matched = false;
                for (int r = 0; r < 4; r++) {
                    if (Arrays.deepEquals(board, cur)) {
                        answer += board.length;
                        used[t] = true;
                        matched = true;
                        break;
                    }
                    cur = rotation(cur);
                }
                if (matched) break;
            }
        }
        return answer;
    }
    public int[][] findDiagram(int[][] arr, int x, int y, int target, boolean[][] visited) {
        Queue<int[]> q = new ArrayDeque<>();
        List<int[]> list = new ArrayList<>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;
        
        // 기존 좌표 값 구하기
        while (!q.isEmpty()) {
            int[] cdn = q.poll();
            list.add(new int[]{cdn[0], cdn[1]});
            
            // x+1 검사
            if (cdn[0] != arr.length-1 && 
                arr[cdn[0]+1][cdn[1]] == target && 
                visited[cdn[0]+1][cdn[1]] == false) {
                visited[cdn[0]+1][cdn[1]] = true;
                q.offer(new int[]{cdn[0]+1, cdn[1]});
            }
            // x-1 검사
            if (cdn[0] != 0 && 
                arr[cdn[0]-1][cdn[1]] == target &&
                visited[cdn[0]-1][cdn[1]] == false) {
                visited[cdn[0]-1][cdn[1]] = true;
                q.offer(new int[]{cdn[0]-1, cdn[1]});
            }
            // y+1 검사
            if (cdn[1] != arr.length-1 && 
                arr[cdn[0]][cdn[1]+1] == target && 
                visited[cdn[0]][cdn[1]+1] == false) {
                visited[cdn[0]][cdn[1]+1] = true;
                q.offer(new int[]{cdn[0], cdn[1]+1});
            }
            // y-1 검사
            if (cdn[1] != 0 && 
                arr[cdn[0]][cdn[1]-1] == target &&
                visited[cdn[0]][cdn[1]-1] == false) {
                visited[cdn[0]][cdn[1]-1] = true;
                q.offer(new int[]{cdn[0], cdn[1]-1});
            }
        }
        // 좌표 값 최적화 (-> 0,0으로)
        // 최솟값 찾기
        int minX = list.stream().mapToInt(c -> c[0]).min().getAsInt();
        int minY = list.stream().mapToInt(c -> c[1]).min().getAsInt();

        // (0,0) 기준으로 이동
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i][0] = list.get(i)[0] - minX;
            result[i][1] = list.get(i)[1] - minY;
        }
        // 정렬 (비교를 위해)
        Arrays.sort(result, (a, b) -> a[0] != b[0] ? a[0]-b[0] : a[1]-b[1]);
        return result;
        // 최적화된 int[][] return
    }
    public int[][] rotation(int[][] piece) {
        int[][] rotated = new int[piece.length][2];
        for (int i = 0; i < piece.length; i++) {
            rotated[i][0] = piece[i][1];
            rotated[i][1] = -piece[i][0];
        }
        // 정규화 (음수 제거)
        int minX = Arrays.stream(rotated).mapToInt(c -> c[0]).min().getAsInt();
        int minY = Arrays.stream(rotated).mapToInt(c -> c[1]).min().getAsInt();
        for (int[] r : rotated) { r[0] -= minX; r[1] -= minY; }
        Arrays.sort(rotated, (a, b) -> a[0] != b[0] ? a[0]-b[0] : a[1]-b[1]);
        return rotated;
    }
}