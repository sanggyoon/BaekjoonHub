class Solution {
    public long solution(String numbers) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder number = new StringBuilder();
        
        for (int i=0; i<numbers.length(); i++){
            sb.append(numbers.charAt(i));
            String s = sb.toString();
            
            switch (s) {
                case "one":
                    number.append("1");
                    sb.setLength(0);
                    break;
                case "two":
                    number.append("2");
                    sb.setLength(0);
                    break;
                case "three":
                    number.append("3");
                    sb.setLength(0);
                    break;
                case "four":
                    number.append("4");
                    sb.setLength(0);
                    break;
                case "five":
                    number.append("5");
                    sb.setLength(0);
                    break;
                case "six":
                    number.append("6");
                    sb.setLength(0);
                    break;
                case "seven":
                    number.append("7");
                    sb.setLength(0);
                    break;
                case "eight":
                    number.append("8");
                    sb.setLength(0);
                    break;
                case "nine":
                    number.append("9");
                    sb.setLength(0);
                    break;
                case "zero":
                    number.append("0");
                    sb.setLength(0);
                    break;
            }
        }
        answer = Long.parseLong(number.toString());
        
        return answer;
    }
}