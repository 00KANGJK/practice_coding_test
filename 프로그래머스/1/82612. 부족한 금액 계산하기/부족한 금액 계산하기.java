//price의 배수를 구하는게 key point
//등차수열의 합 구하는 공식 적용 n * (2 * a + (n - 1) * d) / 2
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = ((long)count * (2 * price + ((long)count - 1) * price) / 2) ;
        
        if(total<money) return 0;
        
        total-= (long)money;
        return total;
    }
}