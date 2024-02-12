class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int total_sum = 0;
        for(int i =0; i<10; i++){
            total_sum+=i;
            for(int j=0; j<numbers.length; j++){
                if(numbers[j]==i){
                    answer+=i;
                }
            }
        }
        answer= total_sum-answer;
        return answer;
    }
}