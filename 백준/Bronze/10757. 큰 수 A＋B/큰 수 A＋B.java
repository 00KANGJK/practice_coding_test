import java.math.BigInteger;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger(); //숫자가 크기 때문에 bigInteger
		BigInteger b = sc.nextBigInteger();
        
		a=a.add(b); //그냥 사칙연산으로 할 경우, 컴파일 에러 발생 -> .add() 사용 
		System.out.println(a);

	}
}