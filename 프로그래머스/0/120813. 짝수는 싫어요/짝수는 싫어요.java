class Solution {
    public int[] solution(int n) {
        int arrSize = 0;
        if(n%2 == 0) {
            arrSize = n/2;
        } else {
            arrSize = n/2+1;
        }
        
        int[] answer = new int[arrSize];
        int index = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                answer[index] = i;
                index++;
            }
        }
        
        return answer;
    }
}