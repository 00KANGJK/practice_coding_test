class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count =0;
        for(int i =0; i<answer.length; i++){
            count=0;
            for(int j=i+1; j<answer.length; j++){
                if(prices[i]<=prices[j]){
                    count++;
                }
                else {
                    count++;
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}