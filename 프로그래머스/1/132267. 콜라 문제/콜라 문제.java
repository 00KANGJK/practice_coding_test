class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            answer += (n/a)*b;
            n = (n/a)*b + n%a;
        }
        return answer;
    }
}
//answer에 돌려받은 콜라병의 갯수(n)를 받는다.
//총 콜라병 갯수(n)를 최신화 해줌.