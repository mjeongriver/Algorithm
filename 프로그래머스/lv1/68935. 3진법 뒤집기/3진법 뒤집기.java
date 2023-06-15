class Solution {
    public int solution(int n) {
        
        String answer = "";
        int answer2 = 0;
        
        //10진법 3진법으로 변환
        answer = Integer.toString(n,3);
        
        //앞뒤 반전
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
       
        //3진법 10진법으로 변환
        answer2 = Integer.parseInt(reverse, 3);
        
        return answer2;
    }
}