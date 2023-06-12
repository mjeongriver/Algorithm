class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for(int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            
            //substring() 메서드의 두번째 매개변수는 자를 문자열의 끝 인덱스를 포함하지 않음
            answer += str.substring(parts[i][0], parts[i][1]+1);
        }
        return answer;
    }
}