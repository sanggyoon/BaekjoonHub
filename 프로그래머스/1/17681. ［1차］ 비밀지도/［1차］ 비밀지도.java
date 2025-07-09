class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i=0; i<n; i++){
            int[] binary1 = getBinary(arr1[i], n);
            int[] binary2 = getBinary(arr2[i], n);
            
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<n; j++){
                if ((binary1[j] == 1) || (binary2[j] == 1)){
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
                answer[i] = sb.toString();
            }
        }        
        return answer;
    }
    
    public int[] getBinary(int number, int n){
        int[] binary = new int[n];
        for (int i=0; i<n; i++){
            binary[n-i-1] = number % 2;
            number /= 2;
        }
        return binary;
    }
}