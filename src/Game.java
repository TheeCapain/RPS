public class Game {
  UI ui = new UI();

  public void displayScore() {

  }

  public void play() {

  }

  public String getHand(int hand) {
    String move = null;

    switch (hand) {
      case 1 -> {
        ui.printString("Rock");
        move = "Rock";
      }
      case 2 -> {
        ui.printString("Paper");
        move = "Paper";
      }
      case 3 -> {
        ui.printString("Scissors");
        move = "Scissors";
      }
      default -> ui.printString("Error, Put in an int between 1-3");


    }
    return move;
  }
}
