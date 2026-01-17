class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String[][] keypad = {{"1", "2", "3"},
                             {"4", "5", "6"},
                             {"7", "8", "9"},
                             {"*", "0", "#"}};
        int[] leftHand = {3, 0};
        int[] rightHand = {3, 2};
        
        StringBuilder sb = new StringBuilder();
        for (int n : numbers) {
            int[] targetLocation = calLocate(keypad, n);
            if (targetLocation[1] == 0) {
                sb.append("L");
                leftHand = targetLocation;
            } else if (targetLocation[1] == 2) {
                sb.append("R");
                rightHand = targetLocation;
            } else {
                int a = Math.abs(targetLocation[0] - rightHand[0]) +
                    Math.abs(targetLocation[1] - rightHand[1]);
                int b = Math.abs(targetLocation[0] - leftHand[0]) +
                    Math.abs(targetLocation[1] - leftHand[1]);
                if (a == b && hand.equals("right")) {
                    sb.append("R");
                    rightHand = targetLocation;
                } else if (a==b && hand.equals("left")) {
                    sb.append("L");
                    leftHand = targetLocation;
                } else if (a > b) {
                    sb.append("L");
                    leftHand = targetLocation;
                } else if (b > a) {
                    sb.append("R");
                    rightHand = targetLocation;
                }
            }
        }
        
        return answer = sb.toString();
    }
    
    public int[] calLocate(String[][] keypad, int number) {
        int[] location = new int[2];
        for (int i = 0; i<keypad.length; i++) {
            for (int j =0; j<keypad[0].length; j++) {
                if (String.valueOf(number).equals(keypad[i][j])) {
                    location[0] = i;
                    location[1] = j;
                    return location;
                }
            }
        }
        return location;
    }
}