import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        
        //n번째 문자를 맨 앞에 추가하여 list에 저장
        for(int i=0; i<strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        //오름차순 정렬
        Collections.sort(list);
        
        //추가한 문자를 제외한 문자열 answer 배열에 저장
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }

        return answer;
    }
}