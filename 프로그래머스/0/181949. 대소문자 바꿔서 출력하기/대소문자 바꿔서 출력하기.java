import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len = a.length(); // 제한사항 반영 1 ≤ str의 길이 ≤ 20
        char b; //대소문자 검사할 글자
        String anw = ""; //변환된 문장 출력
        
        if(len >= 1 && len <= 20){ //제한사항 반영
            for(int i = 0; i<len; i++){ 
                b = a.charAt(i); //한글자씩 받아내기
                //대문자->소문자, 소문자->대문자로 변경
                if(Character.isUpperCase(b)) anw += Character.toLowerCase(b);
                if(Character.isLowerCase(b)) anw += Character.toUpperCase(b);
            }
            System.out.println(anw); //답변 출력
        }
    }
}