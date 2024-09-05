class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int a = s.length();
        if(a==4 || a==6){
            for(int i=0; i<a; i++){
                if(s.charAt(i)<'0' || s.charAt(i)>'9') answer = false;
            }
        }
        else{
            answer = false;
        }
        return answer;
    }
}