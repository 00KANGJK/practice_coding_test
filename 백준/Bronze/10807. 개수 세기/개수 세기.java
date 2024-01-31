import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howMany = sc.nextInt();
        int[] arr = new int[howMany];
        for(int i =0; i < howMany; i++) {
            arr[i] = sc.nextInt();
        }

        int find = sc.nextInt();
        int count = 0;
        for(int i = 0; i < howMany; i++) {
            if(arr[i] == find) {
                count++;
            }
        }
        System.out.println(count);
    }
}
