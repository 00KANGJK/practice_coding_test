//우리가 고를 수 있는 최대 종류 수, N/2
//중복되지 않게 숫자를 하나씩만 남겨놓음. -> 몰라서 공부했던 부분.

import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length/2;
        
        nums = Arrays.stream(nums).distinct().toArray();
        int n1 = nums.length;
        
        if(n1 >= n) answer = n;
        else answer = n1;
        
        return answer;
    }
}