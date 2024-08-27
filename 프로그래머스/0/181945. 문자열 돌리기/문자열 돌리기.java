import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        for(int i =0; i< a.length(); i++){
            b = a.charAt(i);
            System.out.println(b);
        }
    }
}