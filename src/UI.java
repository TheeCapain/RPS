import java.util.Arrays;
import java.util.Scanner;

public class UI {
    Scanner scan = new Scanner(System.in);
    String[] menu = {"1.Play Game", " 2.Quit game"};

    public void printString(String message) {
        System.out.println(message);
    }

    public int scanInt() {
        return scan.nextInt();
    }

    public String scanString() {
        return scan.nextLine();
    }

    @Override
    public String toString() {
        return Arrays.toString(menu);
    }
}
