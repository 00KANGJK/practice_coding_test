import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int repeat = num1/4;

        for(int i = 0; i < repeat; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
