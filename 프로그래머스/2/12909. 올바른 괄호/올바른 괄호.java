//
//
class Solution {
    boolean solution(String s) {
        boolean answer = true;  
        if(s.charAt(0) == ')') return false;
        if(s.charAt(s.length()-1)=='(') return false;
        
        int a = 0;
        
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='(') a++;
            if(s.charAt(i)==')') a--;
            if(a == (-1)) return false;
        }
        if(a!=0) return false;
        return answer;
    }
}