//처음 입력받는 두 수, 총 바구니 수 / 총 바꿀 횟수
//순서대로 ball의 번호를 넣어 배열을 만든다.
//바꿀 두 번호를 입력받아. 서로 교환해준다.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] ball = new int[a];
        for(int i =0; i< a; i++){
            ball[i] = i+1;
        }
        
        for(int i =0; i< b; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int change = ball[x-1];
            ball[x-1] = ball[y-1];
            ball[y-1] = change;
        }
        for(int i=0; i< ball.length; i++){
            System.out.print(ball[i]+" ");
        }
	}
}