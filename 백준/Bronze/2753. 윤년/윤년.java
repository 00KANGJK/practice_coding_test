import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c11();
  }
  void c11(){
    Scanner s = new Scanner(System.in);
    
    int year = s.nextInt();
    if(year%4==0){
      if(year%100==0){
        if(year%400==0){
          System.out.print("1");
        }
        else{
          System.out.print("0");
        }
      }
      else{
        System.out.print("1");
      }
    }
    else{
      System.out.print("0");
    }
  }
}