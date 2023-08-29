import java.util.*;

class Solution {
    public int solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            //stack의 최상단 값이 현재 값과 같으면 stack에서 값 제거
            //stack이 비어있을 때는 스택의 맨 위 값을 확인하거나 제거할 수 없기 때문에 조건 추가
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i)); //stack의 최상단의 값과 현재 값이 다를 경우 스택에 추가
            } 
        }

        return stack.isEmpty() ? 1:0; //stack이 비어있다면 1 반환
    }
}