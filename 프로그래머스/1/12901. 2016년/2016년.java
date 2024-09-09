//요일, 월 배열 생성
//월 날짜 더해주고, 일 날짜 다해서 요일 구할꺼임.
//금요일 시작이기 때문에, 4 더해줌
class Solution {
    public String solution(int a, int b) {
        String[] answer = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] month = {0,31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int cal = 0;
        for(int i =0; i<a; i++){
            cal+= month[i];
        }
        cal+=b;
        
        return answer[(cal+4)%7];//금요일 시간이기 때문
    }
}