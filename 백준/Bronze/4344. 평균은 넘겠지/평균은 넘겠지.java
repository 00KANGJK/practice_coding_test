import java.util.*;
// 몇번, 몇명, 그에 따른 점수 입력
// 각각 평균보다 높은 사람의 비율 소수점 3자리까지 출력 %도 출력해야함.
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int sum;
        double avg;
        
        for(int i =0; i<times; i++){
            int pnum = sc.nextInt();
            int[] pscore = new int[pnum];
            int cnt =0;
            sum = 0;
            
            for(int j=0; j<pnum; j++){
                pscore[j] = sc.nextInt();
                sum+= pscore[j];
            }
            avg = (double)sum/pnum;
            
            for(int j=0; j<pnum; j++){
                if(pscore[j]>avg) cnt++;
            }
            
            System.out.printf("%.3f%%\n",(double)cnt/pnum*100.0);
        }
	}
}