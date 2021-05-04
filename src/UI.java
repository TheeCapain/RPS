import java.util.Scanner;

public class UI {
  Scanner scan = new Scanner(System.in);
  public void printString(String message){
    System.out.println(message);
  }

  public int scanInt(){
    return scan.nextInt();
  }

  public String scanString(){
    return scan.nextLine();

  }
}
