class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        //왼쪽과 오른쪽 패턴을 저장할 변수
        String left = "";
        String right = "";
        
        for(int i=1; i<food.length; i++) { //주어진 음식 배열을 순회하며 패턴을 생성
            if(food[i] != 0) {
                for(int j=0; j<food[i]/2; j++) { //음식이 0이 아닌 경우, 음식 수의 절반만큼 왼쪽 패턴에 추가
                    left += Integer.toString(i);
                }
            }
        }
        
        //왼쪽 패턴을 역순으로 오른쪽 패턴에 저장
        StringBuffer sb = new StringBuffer(left); 
        right = sb.reverse().toString();
        
        //최종 결과 문자열 생성(왼쪽 패턴 + "0" + 오른쪽 패턴)
        answer = left + "0" + right;
        
        return answer;
    }
}