//숫자를 String으로 변경해서 하나씩 더해준다.
//x를 더한 값으로 나눈다.-> 나눈 값의 나머지가 없으면 true 아니면 false
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String a = Integer.toString(x);
        int numH = 0;
        for(int i =0; i<a.length(); i++){
            char n = a.charAt(i);
            numH += n - '0';
        }
        if(x%numH !=0 ) answer = false;
        return answer;
    }
}