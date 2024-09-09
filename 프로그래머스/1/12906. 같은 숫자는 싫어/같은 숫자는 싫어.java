//하나씩 검사하는 방법으로 진행
//x에 배열에 저장된 숫자 저장하고 그것과 같으면 패스
//다르면, 배열에 저장하고 그 변수도 바꿔준다.
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> answerList = new ArrayList<>();
        int a = arr[0];
        answerList.add(a);
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != a){
                a = arr[i];
                answerList.add(a);
            }
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}

//몰랐던 부분
//int[]에 값을 추가하려면 새 배열을 만들어서 넣어줘야한다는 점.
//그래서 ArrayList 생성해서 값을 찾고, 그 값을 다시 넣어줌.