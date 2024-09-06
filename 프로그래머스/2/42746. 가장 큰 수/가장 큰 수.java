//숫자 배열 중에 가장 앞자리가 큰 순서대로 나열하면 됨.
//앞자리가 같은 경우, 그 다음자리는 비교
//return type -> String임. 그렇다면 붙이는 것도 숫자를 String으로 바꿔서 합쳐야함.
import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        StringBuilder s = new StringBuilder();
        
        String[] nums = new String[numbers.length];
        
        for(int i=0; i<nums.length; i++){
            nums[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b)); //내림차순 정렬
        //ex) 10+2 = 102 / 2+10 = 210 -> 210이 더 커서 순서가 2,10으로 정렬됨.
        
        if(nums[0].equals("0")) return "0";
        
        for(int i=0; i<nums.length; i++){
            s.append(nums[i]);
        }
        
        return s.toString();
    }
}