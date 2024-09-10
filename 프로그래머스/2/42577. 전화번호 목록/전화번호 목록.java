//정렬을 한다. -> 접두사 바로 뒤에 접두사가 사용된 String이 옴.(속도)
//포함된거 확인, contains로 접두사 확인 어렵
//matches로 (.*) 사용 -> sql이랑 비슷한 부분
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=1; i<phone_book.length; i++){
            String str = phone_book[i-1]+"(.*)";
            if(phone_book[i].matches(str)) return false;
        }
        
        return answer;
    }
}