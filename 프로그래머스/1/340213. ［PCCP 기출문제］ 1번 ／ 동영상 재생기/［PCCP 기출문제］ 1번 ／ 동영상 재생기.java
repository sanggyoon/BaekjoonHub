class Solution {    
    
    public int change_seconds(String time){
        int minutes = 0;
        int seconds = 0;
        int total_seconds = 0;
        
        minutes = Integer.parseInt(time.substring(0, 2));
        seconds = Integer.parseInt(time.substring(3, 5));
        total_seconds = minutes * 60 + seconds;
        return total_seconds;
    }
    
    public String solution(
        String video_len, 
        String pos, 
        String op_start, 
        String op_end, 
        String[] commands
    ) {
        int seconds_video_len = change_seconds(video_len);
        int seconds_pos = change_seconds(pos);
        int seconds_op_start = change_seconds(op_start);
        int seconds_op_end = change_seconds(op_end);
        int seconds_result = seconds_pos;
        int result_mm = 0;
        int result_ss = 0;
        
        for (String command:commands){
            if (seconds_op_start <= seconds_result&&seconds_result <= seconds_op_end){
                seconds_result = seconds_op_end;
            }
            switch (command) {
                case "prev":
                    seconds_result -= 10;
                    if (seconds_result < 0){
                        seconds_result = 0;
                    }
                    break;
                case "next":
                    seconds_result += 10;
                    if (seconds_result > seconds_video_len){
                        seconds_result = seconds_video_len;
                    }
                    break;
            }
            if (seconds_op_start <= seconds_result&&seconds_result <= seconds_op_end){
                seconds_result = seconds_op_end;
            }
        }
        result_mm = seconds_result / 60;
        result_ss = seconds_result % 60;
        
        String answer = String.format("%02d:%02d", result_mm, result_ss);
        return answer;
    }
}