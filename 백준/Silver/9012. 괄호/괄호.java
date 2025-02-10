import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); 

        StringBuilder sb = new StringBuilder(); 

        for (int i = 0; i < t; i++) {
            String input = br.readLine(); 
            if (isValidPS(input)) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb); 
    }

    public static boolean isValidPS(String s) {
        Deque<Character> stack = new ArrayDeque<>(); 

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c); 
            } else {
                if (stack.isEmpty()) {
                    return false; 
                }
                stack.pop(); 
            }
        }

        return stack.isEmpty(); 
    }
}
