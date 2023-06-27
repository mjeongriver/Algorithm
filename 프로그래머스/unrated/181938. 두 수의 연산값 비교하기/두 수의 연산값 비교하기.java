class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int answer1 = 0;
        
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        
        answer = Integer.parseInt(aStr + bStr);
        answer1 = 2 * a * b;
        
        if(answer >= answer1) {
            return answer;
        } else {
            return answer1;
        }
        
    }
}