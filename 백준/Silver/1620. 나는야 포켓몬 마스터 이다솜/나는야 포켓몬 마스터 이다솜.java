import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = sc.nextInt();

        HashMap<String, String> map = new HashMap<>();

        for(int i = 0; i < num; i++) {
            String key = Integer.toString(i+1);
            String value = sc.next();
            map.put(key, value);
            map.put(value, key);
        }

        for(int i = 0; i < answer; i++) {
            String chance = sc.next();
            System.out.println(map.get(chance));
        }
    }
}
