//합을 구하는 것은 그냥 등차가 1인 수열의 합 구하는 방법

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int total = a*(1+a)/2;
        
        System.out.println(total);
	}
}