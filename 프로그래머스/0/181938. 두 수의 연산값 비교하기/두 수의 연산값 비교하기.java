import java.lang.Math;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String temp = String.valueOf(a);
        
        String num1 = temp+b;
        
        int num2 = 2*a*b;
        
        if(num1.equals(String.valueOf(num2))) {
            answer = num2;
        } else {
            answer = Math.max(Integer.parseInt(num1),num2);
        }
        
        return answer;
    }
}