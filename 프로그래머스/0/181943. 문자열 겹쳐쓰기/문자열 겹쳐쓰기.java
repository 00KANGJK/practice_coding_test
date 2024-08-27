class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        answer = my_string.substring(0,s); //s전까지 answer에 복사를 한다.
        answer += overwrite_string; //overwriting_string을 answer에 붙임.
        int over_len = answer.length();
        int my_len = my_string.length();
        char b;
        
        //answer의 길이가 my_string보다 짧으면 -> 뒤에 부족한 만큼 my_string을 붙임.
        if(over_len < my_len){
            for(int i = over_len; i< my_len; i++){
                b = my_string.charAt(i);
                answer += b;
            }
        }
        return answer;
    }
}