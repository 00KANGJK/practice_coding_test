class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int len = str1.length();
        char a,b;
        
        for(int i =0; i<len; i++){
            a = str1.charAt(i);
            b = str2.charAt(i);
            answer += a;
            answer += b;
        }
        return answer;
    }
}