import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        //n을 문자열 배열에 넣은 후 내림차순 정렬
        String [] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        //문자열 배열 반복 돌려서 문자열로 만든 후 Long으로 형 변환
        String answer2 = "";
        for(String s : str) {
            answer2 += s;
        }
        
        answer = Long.parseLong(answer2);
        
        return answer;
    }
}