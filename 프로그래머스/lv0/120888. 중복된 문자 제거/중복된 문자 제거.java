class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        //현재 문자가 처음으로 나타나는 위치가 현재 인덱스와 같으면 중복되지 않는 문자임
        for(int i=0; i<my_string.length(); i++){
            if(my_string.indexOf(my_string.charAt(i)) == i){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}