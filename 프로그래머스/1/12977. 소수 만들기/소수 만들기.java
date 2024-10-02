class Solution {
    public int solution(int[] nums) {
        int answer =0;
        
        for(int i =0; i< nums.length; i++){
            for(int j =i+1; j< nums.length; j++){
                for(int k =j+1; k< nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(calnum(sum)) answer++;
                }
            }
        }
        return answer;
    }
    
    public boolean calnum(int n){ //소수 구하는 방법을 찾으면 모든 숫자를 검사할 필요없이 수학적으로 제곱근까지만 구하면 된다함.
        for (int i = 2; i*i <= n; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}
