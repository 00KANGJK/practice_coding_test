class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n == 0) return 0;
        else if (n==1) return 1;
        
        int n1 = 0;
        int n2 = 1;
        
        for(int i = 2; i<=n; i++){
            answer = (n1 + n2) % 1234567;
            n1 = n2;
            n2 = answer;
        }
        return answer;
    }
}