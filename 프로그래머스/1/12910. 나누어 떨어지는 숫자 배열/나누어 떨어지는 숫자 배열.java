import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        //나눠지는 숫자의 갯수를 구한다.
        //해당 숫자만큼 return할 배열을 선언하고, 나눠지는 숫자를 넣는다.
        //오름차순으로 sorting 해준다.
        int cnt =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]%divisor == 0) cnt ++;
        }
        int[] fail = {-1};
        if(cnt == 0) return fail;
        
        Arrays.sort(arr); //먼저 정렬을 한다.
        int[] ans = new int[cnt];
        int ord =0;
        for(int i=0; i< arr.length; i++){
            if(ord == cnt) break;
            if(arr[i]%divisor == 0 && ord !=cnt) {
                ans[ord] = arr[i];
                ord++;
            }
        }
        
        return ans;
    }
}