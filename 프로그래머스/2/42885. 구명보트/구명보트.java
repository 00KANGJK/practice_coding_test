//최대 2명 탑승 / 무게 제한.
//배열을 오름차순으로 정렬함.  Arrays.sort(배열)
//가장 아래, 가장 위에부터 두개씩 더해서 limit을 넘는지 확인
//넘지 않으면 answer ++, i++
import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;
        Arrays.sort(people);
        for(int i=people.length-1; min<=i; i--){
            if(people[min]+people[i]<=limit) {
                min++;
            }
            answer++;
        }
        
        return answer;
    }
}