//h 조건
//h는 0이면 안됨. -> 제한사항에 1편이상이라 관리 안함.
//h는 배열의 길이보다 크면 안됨. -> 그전에 나오지 않을까?
//일단은 정렬하고 하는게 편할꺼 같다. -> 그러면 다시 앞으로 안돌아가도 된다.
//최솟값을 구하는 것이기 때문에 아래서부터 올라가다가 횟수가 일치하는 것이 나오면 그 값 return
import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++) {
			int idx = citations.length - i; //i는 인용된 논문 수
			
			if(citations[i] >= idx) {
				answer = idx;
				break;
			}
		}
        return answer;
    }
}