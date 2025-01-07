import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int center = array.length/2;
        answer = array[center];
        
        return answer;
    }
}