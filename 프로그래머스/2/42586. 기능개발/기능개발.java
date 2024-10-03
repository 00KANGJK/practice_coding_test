import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        Queue<Integer> works = new LinkedList<>();
        
        for(int i =0; i< progresses.length; i++){ // Queue에 progresses값 넣기
            float cal = (100-progresses[i])/speeds[i];
            if((100.0-progresses[i])%speeds[i] != 0) cal++;
            works.offer((int)cal);
        }
        System.out.println(works);
        
        while(!works.isEmpty()){
            int work = works.poll();
            int count = 1;
            
            while(!works.isEmpty()){
                if(work < works.peek()) break;
                works.remove();
                count++;
            }
            
            answer.add(count);
        }
        
        works.clear();
        return answer;
    }
}
//입력값 설명
//progresses : 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열
//speeds : 각 작업의 개발 속도가 정힌 배열(하루 당 n%씩 증가)
//리턴값 설명
//배포할 때마다 몇개의 기능이 배포되었는지 출력함.

//생각 정리
//큐를 이용해서 풀면 될꺼 같다. (FIFO)를 이용한다.
//progresses의 값을 큐에 넣고 speeds를 기반으로 증가를 시켜준다.
//100이 넘는 숫자들은 remove 하고, answer의 값을 증가시킨다.
//이 과정을 반복 후, answer를 return 한다.
