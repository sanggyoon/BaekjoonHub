import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        for (int i=0; i<strings.length-1; i++){
            for (int j=i+1; j<strings.length; j++){
                if ((strings[i].charAt(n) > strings[j].charAt(n)) ||
                ((strings[i].charAt(n) == strings[j].charAt(n)) && 
                 (strings[i].compareTo(strings[j]) > 0))){
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        return strings;
    }
}