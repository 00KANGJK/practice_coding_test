import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int len = str.length();
        if(len >=1 && len <=10 && n>=1 && n<=5 ){
            for(int i = 0; i<n; i++) System.out.print(str);
        }
    }
}