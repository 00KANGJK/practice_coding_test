import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		int person = in.nextInt();
		
		int[] arr = new int[person];
		
		for(int i = 0; i < person; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);
 
 
		int prev = 0;	
		int sum = 0;	
				
		for(int i = 0; i < person; i++) {	
			sum += prev + arr[i];
			prev += arr[i];
		}
		System.out.println(sum);
    }
}
