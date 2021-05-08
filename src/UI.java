import java.util.Scanner;

public class UI {
    Scanner scan = new Scanner(System.in);
    final String ANSI_RESET = "\u001B[0m";

    public void printString(String message) {
        System.out.println(message);
    }

    public void ANSI_RED(String message){
        System.out.println("\u001b[31m" + message + ANSI_RESET);
    }

    public void ANSI_BLUE(String message){
        System.out.println("\u001b[34m" + message + ANSI_RESET);
    }

    public void ANSI_GREEN(String message){
        System.out.println("\u001b[32m" + message + ANSI_RESET);
    }

    public void ANSI_YELLOW(String message){
        System.out.println("\u001b[33m" + message +ANSI_RESET);
    }

    public String scanString() {
        return scan.nextLine();
    }

    public int scanInt(){
        return scan.nextInt();
    }

    public void printStats(String message, int nr){
        System.out.println(message+ nr);

    }

}
