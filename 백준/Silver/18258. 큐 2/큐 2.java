import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> queue = new ArrayDeque<>();
 
        int n = Integer.parseInt(br.readLine()); 

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                queue.addLast(value); 
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.pollFirst() + "\n"); 
                }
            } else if (command.equals("size")) {
                bw.write(queue.size() + "\n"); 
            } else if (command.equals("empty")) {
                bw.write((queue.isEmpty() ? "1" : "0") + "\n"); 
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.peekFirst() + "\n"); 
                }
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.peekLast() + "\n"); 
                }
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
