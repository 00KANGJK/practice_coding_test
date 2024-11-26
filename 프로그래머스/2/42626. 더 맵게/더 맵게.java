import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int i=0;
        int sum=0;
        //낮은 숫자 부터
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        for(i=0; i<scoville.length; i++){
            pq.add(scoville[i]);
        }
        
        while (pq.peek() < K){
            if(pq.size()==1) return -1;
            answer++;
            pq.add(pq.poll() + pq.poll()*2);
        }
        
        return answer;
    }
}
/*
1. 작은 순서대로 나열한다.
2. i번째 값이 K이상인지 판단
    2.1. (K미만) i번째와 i+1번째 값을 i + (i+1) *2 를 한다. answer ++:
         이때, 계산값과 i+2번째 값이 K이상이면 멈춤.
    2.2. (K이상) 종료
*/