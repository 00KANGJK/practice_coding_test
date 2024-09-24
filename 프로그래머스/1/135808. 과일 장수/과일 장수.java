import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i =score.length; i>=m; i-=m){
            answer+= score[i-m] * m;
        }
        return answer;
    }
}
//한 상자에 m개, 사과의 최대 점수 k점.
//정렬 후 뒤에서부터 진행
//m씩 잘라서 가장 뒤에 있는 숫자 x m x 박스 수