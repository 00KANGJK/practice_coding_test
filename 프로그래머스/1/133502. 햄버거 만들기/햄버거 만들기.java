//햄버거 포장하는 순서: 빵 – 야채 – 고기 - 빵
//숫자로 표현하면 : 1 - 2 - 3 - 1 이런 식임.
//String으로 저장해서 포함하고 있는 거 (contain()) 확인하고
//replace 날려버리기
import java.util.ArrayList;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> ham = new ArrayList<>();
        for(int i=0; i<ingredient.length; i++){
            ham.add(ingredient[i]);
            if(ham.size()>=4 && 
               ham.get(ham.size()-4)==1 && 
               ham.get(ham.size()-3)==2 && 
               ham.get(ham.size()-2)==3 && 
               ham.get(ham.size()-1)==1
              ){
                answer++;
                for(int j =0; j<4; j++) ham.remove(ham.size()-1); //4개 삭제
            }
        }
        return answer;
    }
}
//기존 생각과 달랐던 부분
//처음 생각으로 실행시켰으나 정확도는 물론 시간이 너무 오래 걸렸다.
//그래서 ArrayList로 문제풀이를 하였음.
//ham에 하나씩 저장해서 4개 검사하고 1231 순서가 맞으면 answer++ 4개 삭제.