class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        for(int i = 0; i < sb.length(); i++) {
            answer += sb.charAt(i);
        }
        return answer;
    }
}