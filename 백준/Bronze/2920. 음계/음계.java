//8개의 정수를 입력 받는다.
//1~8의 오름차순, 내림차순 배열 생성
//두 배열과 비교해서 다르면 mixed, 일치하는 걸 출력한다.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] nums = new int[8];
        int[] asc = {1,2,3,4,5,6,7,8};
        int[] des = {8,7,6,5,4,3,2,1};
        String ans = "";
        
        for(int i =0; i<nums.length; i++) nums[i] = sc.nextInt();
        
        if(Arrays.equals(nums,asc)){
            ans = "ascending";
        }else if(Arrays.equals(nums,des)){
            ans = "descending";
        }else ans = "mixed";
        
        System.out.println(ans);
	}
}