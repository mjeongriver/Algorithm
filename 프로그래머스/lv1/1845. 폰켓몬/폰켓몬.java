import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        
        //중복된 값을 허용하지 않고 고유한 값을 유지
        HashSet<Integer> numsSet = new HashSet<>();
        
        //이미 numsSet에 존재하는 값은 추가되지 않음
        for(int num : nums) {
            numsSet.add(num);
        }
        
        if(numsSet.size() > max) {
            return max;
        } else {
            return numsSet.size();
        }
    }
}