import java.util.Arrays;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String[] signin = new String[db.length];
        
        for (int i=0; i<db.length; i++){
            if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])){
                signin[i] = "login";
            } else if (id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])){
                signin[i] = "wrong pw";
            } else {
                signin[i] = "fail";
            }
        }
        
        if (Arrays.asList(signin).contains("login")){
            answer = "login";
        } else if (Arrays.asList(signin).contains("wrong pw")){
            answer = "wrong pw";
        } else {
            answer = "fail";
        }
        return answer;
    }
}