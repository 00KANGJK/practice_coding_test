//두 배열의 길이가 같기 때문에 정렬해서 계산한 경우 쉬움.
//하나는 내림차순으로, 다른 하나는 오름차순으로 정렬함.
//내가 모르는 건. -> 오름차순 Arrays.sort() 사용하면 되는데 내림차순 어떻게 해야하는지 모름.
//람다식으로 하면 코드가 간단하게 보여서 좋음(자바 8버전 이상.)
//내림차순 정렬 : Arrays.sort(intArr, (a, b) -> b - a);
import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int len = A.length;
        for(int i =0; i< A.length; i++) answer += A[i]*B[B.length-i-1];

        return answer;
    }
}