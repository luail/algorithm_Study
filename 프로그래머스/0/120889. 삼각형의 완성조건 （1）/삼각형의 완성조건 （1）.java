import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        Arrays.sort(sides);
        
        max = sides[sides.length-1];
        
        int number = 0;
        
        for(int i = 0; i <= 1; i++) {
             number += sides[i];
        }
        
        if(max < number) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}