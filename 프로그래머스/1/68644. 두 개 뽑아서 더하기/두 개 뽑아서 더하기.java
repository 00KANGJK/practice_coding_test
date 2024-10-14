import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public ArrayList solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        
        for(int i = 0; i< numbers.length; i++) list.add(numbers[i]);
        
        for(int i = 0; i< numbers.length-1; i++){
            for(int j = i+1;j< numbers.length; j++){
                uniqueList.add(list.get(i)+list.get(j));
            }
        }
        HashSet<Integer> set = new HashSet<>(uniqueList); //중복 제거
        ArrayList<Integer> answer = new ArrayList<>(set); //정렬 편하게 하기 위함

        Collections.sort(answer);
        
        return answer;
    }
}
//