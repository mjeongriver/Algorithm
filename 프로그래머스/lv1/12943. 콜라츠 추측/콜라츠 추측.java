class Solution {
    public int solution(long num) { //int 파라미터가 아니라 long로 놓고 풀어야 함
        
        int answer = 0; //작업 횟수
        
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
            
            //작업 횟수가 500이 넘으면 -1을 반환하고 종료
            if (answer >= 500) {
                return -1;
            }
        }
        
        
        return answer;
    }
}