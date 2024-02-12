class Solution {
    public int solution(int[] number) {
        // 1. 배열에서 숫자 3개를 골랐을 때, 합이 0이면 coount ++
        // 2. 3개의 숫자를 어떻게 고를 것이냐?
        // 3. 배열의 길이를 알아야함.
        // 4. 반복문을 사용해서 찾으면 될 듯함.
        int answer = 0;
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                for(int k=j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }
                
                }
            }
        }
        return answer;
    }
}