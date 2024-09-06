//k개의 숫자를 제거해서 가장 큰 숫자를 구해라
//charAt() 이용해서 가장 큰수를 찾아서 하나씩 더하는 방식.
//StringBuilder를 사용할거임. String을 더하는 방법도 있지만 성능이 이게 더 좋음.

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int a = 0; //가장 큰 숫자를 구하고 다시 처음부터 하는게 아니라 그 숫자 다음부터 해야함.
        StringBuilder s = new StringBuilder();
        
        for(int i=0;i<number.length()-k; i++){
            char max = 0;
            
            for(int j=a; j<=i+k; j++){
                if(max<number.charAt(j)){
                    max = number.charAt(j);
                    a = j+1;
                }
            }
            s.append(max);
        }
        answer = s.toString();
        
        return answer;
    }
}