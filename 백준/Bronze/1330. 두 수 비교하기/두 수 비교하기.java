import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a01();
  }
  
  void a01(){
    Scanner s = new Scanner(System.in);
  	
  	int a = s.nextInt();
  	int b = s.nextInt();
    if(a<b){
     System.out.println("<");   
    }
    else if(a>b){
     System.out.println(">");
    }
    else{
        System.out.println("==");
    }

  }
}