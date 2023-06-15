class Solution {
    public int[] solution(int n, int m) {
        //결과를 저장할 배열 생성
        int[] ans = new int[2];
        
        //최대공약수를 저장할 변수 초기화
        int max = 0;
        
        //1부터 n과 m 중 작은 값까지 반복
        for (int i = 1; i <= n && i <= m; i++) {
            //i가 n과 m의 공약수인 경우
            if (n % i == 0 && m % i == 0) {
                //max 변수에 i를 저장 (현재까지의 최대공약수)
                max = i;
            }
        }
        
        //최소공배수 계산
        int min = (n * m) / max;
        
        //결과 배열에 최대공약수와 최소공배수 저장
        ans[0] = max;
        ans[1] = min;
        
        //결과 반환
        return ans;
    }
}