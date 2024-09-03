class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Long cp;
        Long cy;
        
        s = s.toLowerCase();
        cp = s.chars().filter(c -> c == 'p').count(); //stream 사용해서 특정 글자수 세기.
        cy = s.chars().filter(c -> c == 'y').count();

        if(cp!=cy) answer = false;
        return answer;
    }
}