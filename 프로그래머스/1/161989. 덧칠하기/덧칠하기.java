class Solution {
    public int solution(int n, int m, int[] section) {
        int ans = 1;
        int start = section[0];
        // if(start+m-1 >= section[section.length-1]) return 1;
        
        for(int i = 1; i<section.length; i++){
            if(start + m-1<section[i]){
                ans++;
                start=section[i];
            }
        }

        return ans;
    }
}
// 벽을 n개로 나눔(1m), 롤러의 길이는 m, 다시 칠하기 위한 구역 번호 section
// 벽을 칠하는 횟수를 최소화하려고 함.
// section이 정렬되어 있기 때문에 section의 처음과 끝을 저장해줌.
// -> 이유는 굳이 1번 구역부터 할 필요가 없음. 
// 그리고 처음에 m을 더했을때 마지막 벽보다 크거나 같으면 과정을 더 할 필요없다.
// start가 section보다 작거나 같을 때 카운트 하고 m을 더해준다.