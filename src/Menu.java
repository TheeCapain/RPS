public class Menu {
  private final String[] menuItems = {"1. Play game", "2. Most picked hand", "3. BATTLE OF THE AI", "4. Quit"};
  private final String[] choices = {"1. Rock", "2. Paper", "3. Scissors", "9. Back to menu"};
  UI ui = new UI();


  public void printMenu() {
    ui.printString("----------------------------------------");
    for (int i = 0; i < menuItems.length; i++) {
      ui.printString(menuItems[i]);
    }
    ui.printString("----------------------------------------");
  }

  public void choiceMenu() {
    ui.printString("----------------------------------------");
    ui.printString("Pick a hand:");
    for (int i = 0; i < choices.length; i++) {
      ui.printString(choices[i]);
    }
    ui.printString("----------------------------------------");
  }

}
