import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int a = 0; //배열 값의 합
    
        //x를 쪼개서 string 배열에 넣는다.
        String [] arr = String.valueOf(x).split("");
        
        for(int i = 0; i<arr.length; i++) {
            a += Integer.parseInt(arr[i]);
        }
        
        answer = (x % a == 0) ? answer : false;
        
        return answer;
    }
}