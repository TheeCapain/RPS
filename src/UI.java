import java.util.Scanner;

public class UI {
    Scanner scan = new Scanner(System.in);
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_CYAN = "\u001B[36m";
    // final String ANSI_WHITE = "\u001B[37m";
    // final String ANSI_BLACK = "\u001B[30m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_YELLOW = "\u001B[33m";
    final String ANSI_BLUE = "\u001B[34m";
    final String ANSI_PURPLE = "\u001B[35m";

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

}
