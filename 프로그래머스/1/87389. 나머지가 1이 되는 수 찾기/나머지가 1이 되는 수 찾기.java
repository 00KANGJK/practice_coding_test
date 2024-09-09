//x의 숫자는 2부터 시작 -> 나머지가 1이 나오려면 1보다 커야함.
//n과 x가 같으면 skip -> 계산 최소화.
//무한 반복으로 아래부터 올라감. -> 최솟값.
class Solution {
    public int solution(int n) {
        int answer = 2;
        while(true){
            if(n!= answer && n%answer==1){
                break;
            }
            answer++;
        }
        return answer;
    }
}