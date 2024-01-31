import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howMany = sc.nextInt();
        int[] inputA = new int[howMany];
        int[] inputB = new int[howMany];
        for(int i =0; i<howMany; i++){
            inputA[i] = sc.nextInt();
            inputB[i] = sc.nextInt();
        }
        for(int i =0; i<howMany; i++){
            System.out.println("Case #"+(i+1)+": "+inputA[i]+" + "+inputB[i]+" = "+(inputA[i]+inputB[i]));
        }
    }
}
