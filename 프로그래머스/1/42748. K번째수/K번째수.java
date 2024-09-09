//ArrayList 사용. -> 배열 값 추가하기 편리함.
//Collections.sort() 사용. -> ArrayList는 이걸로 정렬
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i =0; i<commands.length; i++){
            ArrayList<Integer> list = new ArrayList();
            for(int a = commands[i][0]-1; a<commands[i][1]; a++){
                list.add(array[a]);
            }
            Collections.sort(list);
            answer[i] = list.get(commands[i][2]-1);
        }
        
        return answer;
    }
}