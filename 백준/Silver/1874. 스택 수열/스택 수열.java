import java.io.*;
import java.util.Stack;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();

        // 수열의 길이
        int N = Integer.parseInt(br.readLine());

        // 스택 생성
        Stack<Integer> stack = new Stack<Integer>();

        // 스택에 넣을 첫번째 숫자: 1
        int start = 1;

        for(int i=0; i<N; i++){
            int value = Integer.parseInt(br.readLine());

            //입력받은 숫자가 start보다 크거나 같다면 이 숫자가 아직 스택에 들어가지 않음
            if( value >= start) {
                for(int num=start; num <= value; num++) {
                    stack.push(num);
                    sb.append('+').append('\n');
                }
                // 다음에 스택에 넣을 숫자 업데이트
                start = value + 1;
            } else if(stack.peek() != value) { //스택의 맨 위 숫자가 입력 숫자와 다르면 수열을 만들 수 없음
                System.out.println("NO");
                System.exit(0);
            }

            stack.pop();    // 스택의 맨 위 숫자가 입력한 숫자와 같으면, 스택에서 숫자를 빼고 수열에 추가
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
 
}