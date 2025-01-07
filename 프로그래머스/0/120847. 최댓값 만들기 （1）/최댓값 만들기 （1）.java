import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int max1 = numbers[numbers.length-1];
        int max2 = numbers[numbers.length-2];
        answer = max1*max2;
        
        return answer;
    }
}