public class Menu {
  private final String[] menuList = {"1. Play game", "2. Most picked hand", "3. Quit"};
  UI ui = new UI();

  public void printMenu(){
    for (int i = 0; i < menuList.length; i++) {
      ui.printString(menuList[i]);
    }
  }
}
