class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int a2b = a*2*b;
        answer = ab > a2b ? ab : a2b;
        return answer;
    }
}