//숫자 5개 입력 받는다.
//Math.pow()를 이용해서 제곱수를 구한다. 다만 return type이 double이기 때문에 int로 바꿔준다.
//모두 더해주고 10으로 나눈 나머지를 출력한다.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i =0; i<5; i++){
            int a = sc.nextInt();
            sum += (int)Math.pow(a,2);
        }
        System.out.println(sum%10);
	}
}