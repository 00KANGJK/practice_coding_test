class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        long big = gcd(w,h);
        long weight = (long)w;
        long height = (long)h;
        
        answer = weight*height - ((weight/big)+(height/big)-1)*big;
        
        return answer;
    }
    
    public static long gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return (long)a;
    }
}
//규칙성을 찾아내보자.
// w,h의 최대공약수만큼 반복한다. (현재, 최대공약수 = 4)
// w/최대공약수 + (h/최대공약수) -1 (현재, 2+3 -1 = 4)
//다른 경우일 때에도 같은 규칙을 보인다.
