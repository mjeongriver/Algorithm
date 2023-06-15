import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        //각 작업의 개발 일수를 큐에 추가
        for (int i = 0; i < progresses.length; i++) {
            int remaining = 100 - progresses[i];
            int days = remaining / speeds[i];
            //개발이 완료되기 위해 추가적으로 1일이 더 필요한 경우 체크
            if (remaining % speeds[i] != 0) {
                days++;
            }
            
            queue.offer(days); //작업들의 개발 일수를 순차적으로 저장
        }

        int count = 0; //현재까지 개발이 완료된 작업의 수
        int prev = 0; //이전 작업의 개발 일수를 저장하는 수

    
        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current > prev) { //현재 작업이 이전 작업보다 오래 걸림
                if (prev != 0) {
                    answerList.add(count);
                }
                prev = current;
                count = 1;
            } else {
                count++; //현재 작업의 개발 일수가 이전 작업보다 작거나 같을 때
            }
        }

        answerList.add(count);

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}