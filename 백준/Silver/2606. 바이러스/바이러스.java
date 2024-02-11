import java.util.Scanner;

public class Main {

    static boolean[] check;
	static int[][] arr;
	static int count = 0;
	
	static int computer;
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computer = sc.nextInt();
        int connect = sc.nextInt();

        arr = new int[computer][computer];
        check = new boolean[computer];

        for(int i = 0; i < connect; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            arr[num1-1][num2-1] = arr[num2-1][num1-1] = 1;
        }

        dfs(1);
			
		System.out.println(count-1);
    }

    public static void dfs(int start) {
		
		check[start-1] = true;
		count++;
		
		for(int i = 0 ; i < computer ; i++) {
			if(arr[start-1][i] == 1 && !check[i])
				dfs(i+1);
		}
    }
		
}
