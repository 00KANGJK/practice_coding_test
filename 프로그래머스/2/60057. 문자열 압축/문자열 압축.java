import java.util.ArrayList;

class Solution {
    
    public int press(String str, int length) {
        StringBuilder sb = new StringBuilder(); // 줄인 문자열을 저장.
        
        String last = "";
        int count = 0;
        for (int start = 0; start < str.length(); start += length) {
            int end = start + length;
            
            if (end > str.length()) end = str.length();
            
            String token = str.substring(start, end); //반복되는 문장.
            
            if (token.equals(last)) count++;
            else {
                if (count > 1) sb.append(count);
                sb.append(last);
                last = token;
                count = 1;
            }
        }
        if (count > 1) sb.append(count); //1은 반복이 아니기 때문에 1보다 큰 값일 경우
        sb.append(last);
        // System.out.println(sb);
        
        return sb.length();
    }
    
    public int solution(String s) {
        int answer = s.length();
        if (s.length() == 1) return 1;
        
        for (int length = 1; length <= s.length()/2; length++) {
            int pressed = press(s, length); // 압축했을 때 문자열의 길이
            if (pressed < answer) { // 최소값 찾기
                answer = pressed;
            }
        }
        
        return answer;
    }
}
