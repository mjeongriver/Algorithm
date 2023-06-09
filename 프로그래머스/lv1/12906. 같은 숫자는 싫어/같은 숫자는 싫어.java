import java.util.*;

public class Solution {
    public int[] solution(int [] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int num : arr) {
            //첫번째 요소는 무조건 스택에 저장
            if (stack.isEmpty()) { 
                stack.push(num);
            
            //스택이 비어있지 않고, 현재 숫자 num이 스택의 top요소와 다를 경우에만 스택에 저장
            } else if (!stack.isEmpty() && num != stack.peek()) {
                stack.push(num);
            }
        }
        
        int[] answer = new int[stack.size()];
    
        //i 변수를 stack.size() - 1부터 0까지 감소시키면 스택의 top부터 시작하여 요소를 꺼내고 answer[i]에 저장
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}