import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        List<String> resultList = new ArrayList<>();

        for (String str : answer) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }

        Collections.sort(resultList);

        String[] resultArray = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
