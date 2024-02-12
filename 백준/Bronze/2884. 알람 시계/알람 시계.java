import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main codingTest = new Main();
    codingTest.a05();
  }
  void a05(){
    Scanner s = new Scanner(System.in);
    int h = s.nextInt();
    int m = s.nextInt();
    m-= 45;
    if(m<0){
      h--;
      m+=60;
    }
    if(h<0){
      h+=24;
    }
    System.out.print(h +" "+m);
  }
}