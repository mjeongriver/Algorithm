import java.util.*;

class Solution {
    public int solution(int num, int k) {
        String num2 = Integer.toString(num); //정수형 길이 구하기

        int answer = -1;

        for (int i = 0; i < num2.length(); i++) {
            int digit = num2.charAt(i) - '0'; //각 자릿수를 정수로 변환

            if (digit == k) {
                answer = i+1;
                break; // k와 일치하는 숫자를 찾았으므로 반복문 종료
            }
        }

        return answer;
    }
}
