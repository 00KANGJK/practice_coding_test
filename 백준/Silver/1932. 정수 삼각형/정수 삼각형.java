import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[][] = new int[n][n];
         int dp[][]=new int[n][n];
         
         for(int i=0; i<n; i++) {
        	 for(int j=0; j<=i; j++) {
        		 arr[i][j]=sc.nextInt();
        	 }
         }
         dp[0][0]=arr[0][0];
         for(int i=1; i<n; i++) {
        	 for(int j=0; j<=i; j++) {
        		 if(j==0) {
        			 dp[i][j]=dp[i-1][j]+arr[i][j];
        		 }
        		 else if(j==j+i) {
        			 dp[i][j]=dp[i-1][j-1]+arr[i][j];
        		 }
        		 else {
        			 dp[i][j]=Math.max(dp[i-1][j-1], dp[i-1][j])+arr[i][j];
        		 } 
        	 }
         }
         int max=0;
         for(int i=0; i<n; i++) {
        	 if(max<dp[n-1][i])
        		 max=dp[n-1][i];
         }
         System.out.println(max);
    }
}