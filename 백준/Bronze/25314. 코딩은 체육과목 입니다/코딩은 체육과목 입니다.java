import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int by = sc.nextInt();
        String result = "";
        for(int i = 0 ; i<by/4; i++){
            result += "long ";
        }
        result +="int";
        System.out.println(result);
	}
}