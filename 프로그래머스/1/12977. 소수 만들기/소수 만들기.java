import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if (isPrime(num)) answer++;
                }
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);
        return answer;
    }
    public boolean isPrime (int num) {
        boolean result;
        double dnum = (double) num;
        int to = (int)Math.sqrt(dnum);
        for (int i=2; i<=to; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}