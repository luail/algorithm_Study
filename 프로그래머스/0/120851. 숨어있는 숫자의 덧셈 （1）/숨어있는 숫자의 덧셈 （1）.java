class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if(a >= '0' && a <= '9') {
                answer += Integer.parseInt(String.valueOf(a));
            }
        }
        
        return answer;
    }
}