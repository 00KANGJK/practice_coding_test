class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right; i++){
            int a = countDivisors(i);
            if(a%2 == 1) answer -=i;
            else answer+=i;
        }
        return answer;
    }
    
    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++; // i는 약수
                if (i != n / i) {
                    count++; // n / i는 다른 약수
                }
            }
        }
        return count;
    }
}