class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splitedString = s.split(" ");
        int[] splitedInt = new int[splitedString.length];

        int max = 0;
        int min = 0;
        
        for (int i = 0; i < splitedString.length; i++){
            splitedInt[i] = Integer.parseInt(splitedString[i]);
        };
        
        max = splitedInt[0];
        min = splitedInt[0];
        
        for (int j = 0; j < splitedInt.length; j++){
            if (max < splitedInt[j]){
                max = splitedInt[j];
            } else if (min > splitedInt[j]){
                min = splitedInt[j];
            };
        }
        answer = min + " " + max;
        return answer;
    }
}