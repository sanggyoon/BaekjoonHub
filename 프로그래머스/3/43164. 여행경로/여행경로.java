import java.util.*;
class Solution {
    public String[] solution(String[][] tickets) {
        int size = tickets.length;
        boolean[] visited = new boolean[size];
        List<String> course = new ArrayList<>();
        course.add("ICN");
        
        // 정렬
        String[] onelineTickets = new String[size];
        for (int i=0; i<size; i++) {
            onelineTickets[i] = tickets[i][0] + tickets[i][1];
        }
        Arrays.sort(onelineTickets);
        System.out.println(Arrays.toString(onelineTickets));
        
        // 깊이 우선 탐색
        course = dfs(onelineTickets, visited, "ICN", course);
        
        return course.toArray(new String[0]);
    }
    
    public List<String> dfs(String[] onelineTickets, 
                    boolean[] visited, 
                    String departure,
                    List<String> course) {
        List<String> newCourse = course;
        int size = onelineTickets.length;
        
        for (int j=0; j<size; j++) {
            if (j == size-1 && visited[j] == true) {
                return newCourse;
            } else if (visited[j] == false) {
                break;
            }
        }
            
        for (int i=0; i<size; i++) {
            String ticket_departure = onelineTickets[i].substring(0,3);
            String ticket_arrive = onelineTickets[i].substring(3,6);
            
            if (ticket_departure.equals(departure) && visited[i] == false) {
                visited[i] = true;
                newCourse.add(ticket_arrive);
                List<String> list = dfs(onelineTickets, visited, ticket_arrive, newCourse);
                if (list.isEmpty()) {
                    visited[i] = false;
                    newCourse.remove(newCourse.size()-1);    
                } else {
                    return newCourse;
                }
            }
        }
        
        return new ArrayList<>();
    }
}