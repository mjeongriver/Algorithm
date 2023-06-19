import java.util.*;

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        ArrayList<String> list = new ArrayList<>();
        String [] arr1 = str1.split("");
        String [] arr2 = str2.split("");
        
        for(int i=0; i<arr1.length; i++) {
            list.add(arr1[i] + arr2[i]);
        }
        
        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
        }
        
        return answer;
    }
}