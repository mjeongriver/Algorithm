import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        for(int i=1; i<=n; i++) {
            queue.addLast(i);
        }
        
        while(!queue.isEmpty()) {
            for(int i=1; i<k; i++) {
                queue.addLast(queue.pollFirst());
            }
            sb.append(queue.pollFirst());
            if(!queue.isEmpty()) sb.append(", ");
        }
        
        sb.append(">");
        System.out.println(sb);
    }    
}
