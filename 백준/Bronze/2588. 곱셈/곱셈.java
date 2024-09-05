//두 숫자 입력 받는다.
//charAt() 이용해서 하나씩 곱하고 출력해줌.
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        
        for(int i=2; i>=0; i--){
            int c = (int)(b.charAt(i)-'0');
            System.out.println(a*c);
        }
        
        System.out.println(a * Integer.parseInt(b));
	}
}