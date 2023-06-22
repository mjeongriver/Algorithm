import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] c = s.toCharArray();
        
        for(int i=0; i<c.length; i++) {
            if (c[i] == ' ') { 
                answer += " ";
                continue;
            }
            
            //현재 문자에 n을 더한 값을 구한다.
            char shifted = (char)(c[i] + n);
            
            //만약 shifted가 소문자 'z'를 초과하는 경우
            if (Character.isLowerCase(c[i]) && shifted > 'z') {
                //다시 'a'부터 시작하도록 26을 빼준다.
                shifted = (char)(shifted - 26);
            }
            
            //만약 shifted가 대문자 'Z'를 초과하는 경우
            if (Character.isUpperCase(c[i]) && shifted > 'Z') {
                //다시 'A'부터 시작하도록 26을 빼준다.
                shifted = (char)(shifted - 26);
            }
            
            answer += Character.toString(shifted);
        }
        
        return answer;
    }
}
