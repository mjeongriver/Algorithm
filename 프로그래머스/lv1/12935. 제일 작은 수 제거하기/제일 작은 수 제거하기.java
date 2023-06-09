import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        } else {
            ArrayList <Integer> arrayList = new ArrayList<>();
            //arr 반복 돌려서 arrayList에 추가
            for (int a: arr) {
                arrayList.add(a);
            }
            
            //arrayList에서 최솟값 구한 후 값이 minimum인 요소 제거
            Integer minimum = Collections.min(arrayList);
            arrayList.remove(minimum);

            int[] resultArray = new int[arr.length - 1];

            //list 요소들 int 배열 반복 돌려서 넣기 
            for (int i = 0; i < arrayList.size(); ++i) {
                resultArray[i] = arrayList.get(i);
            }
            
            return resultArray;
        }
    }

}