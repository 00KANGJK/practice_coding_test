import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            arr[i] = num1+num2;
        }
        for(int i =0; i < num; i++) {
            System.out.println(arr[i]);
        }
    
    }
}
