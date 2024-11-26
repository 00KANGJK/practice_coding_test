class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int i =3; i<sum; i++){
            int a = sum/i;
            if(sum%i==0){
                if(yellow==(a - 2) * (i - 2 )){
                    answer[0] = i;
                    answer[1] = a;
                }
            }
        }
        
        return answer;
    }
}
/*
brown + yellow 의 공약수를 구한다.
가로 길이 >= 세로 길이
yellow=(가로 - 2) * (세로 - 2 )
*/