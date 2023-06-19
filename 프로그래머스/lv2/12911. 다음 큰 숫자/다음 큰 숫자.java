class Solution {
    public int solution(int n) {
        int answer = 0;
       
        int n_cnt = Integer.bitCount(n);  //입력받은 n의 1 개수를 저장
        int b_cnt = 0;  //증가하는 n의 1 개수를 저장 할 변수
        
        while(true){
            n++; //n을 증가
            b_cnt = Integer.bitCount(n); //증가된 n의 1 개수를 저장
            
            if(n_cnt == b_cnt){ //일치하면, answer에 n을 담고 반복문을 빠져나온다
                answer = n;
                break;
            }            
        }
                
        return answer;
    }
}