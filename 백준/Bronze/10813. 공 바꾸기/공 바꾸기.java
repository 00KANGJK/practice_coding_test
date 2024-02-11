import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basket = sc.nextInt();
        int chance = sc.nextInt();
        int[] arr = new int[basket];
        for(int i =0; i < basket; i++) {
            arr[i] = i+1;
        }

        for(int i =0; i<chance; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int exchange = arr[num1-1];
            arr[num1-1] = arr[num2-1];
            arr[num2-1] = exchange;
        }
        for(int i =0; i < basket; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
