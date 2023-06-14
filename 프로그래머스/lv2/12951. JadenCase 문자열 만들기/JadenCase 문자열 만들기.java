class Solution {
    public String solution(String s) {
        
        String answer = "";
		String[] words = s.toLowerCase().split("");
		
		boolean flag = true;
		
        //flag가 true인 경우, 해당 문자 대문자 변환하여 answer에 추가
        //false인 경우, 해당 문자를 그대로 answer에 추가
        //만약 현재 문자가 공백이라면 flag를 true로 설정하여 다음 문자를 대문자로 변환
		for (String word : words) {
			answer += flag ? word.toUpperCase() : word;
			flag = word.equals(" ") ? true : false;
		}

		return answer;
	}
}