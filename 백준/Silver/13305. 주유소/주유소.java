import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int city= sc.nextInt();
        int[] oil = new int[city-1];
        int[] cost = new int[city];

        for(int i=0; i<oil.length; i++){
            oil[i] = sc.nextInt();
        }
        for(int i=0; i<cost.length; i++){
            cost[i] = sc.nextInt();
        }

        int result = oil[0] * cost[0];
        int min = cost[0];

        for(int i=1; i<city-1; i++){
            if(cost[i] < min){
                min = cost[i];
            }
            result += min * oil[i];
        }
        System.out.println(result);

    }
}
