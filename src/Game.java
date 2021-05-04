public class Game {
  UI ui = new UI();
  Computer AI = new Computer();
  Human human = new Human();

  //Entire game consists of:
  //Setting human players name
  //Playing rounds until a winner has been found
  //displays the score

  public void playGame() {
    ui.printString("What is your name? ");
    human.setName(ui.scanString());
    ui.printString("Hello " + human.getName());

    playRound(nrToHand(AI.getMove()), nrToHand(human.setMove()));
  }

  //One round consists of:
  //Human hand
  //AI hand
  //Either returns a tie or a playerPoint

  public void playRound(String aiMove, String playerMove) {

    if (aiMove.equals("Rock") && playerMove.equals("Scissors") || aiMove.equals("Paper") || playerMove.equals("Rock") || aiMove.equals("Scissors") && playerMove.equals("Paper")) {
      ui.printString("Computer wins the round");
      AI.addPoint();
    } else if (aiMove.equals(playerMove)) {
      ui.printString("Its a tie");

    } else {
      ui.printString("Human wins the round");
      human.addPoint();
    }
    displayScore();


  }

  //Pretty self-explanatory
  public void displayScore() {
    ui.printString("Human score: " + human.getPoint() + " AI score: " + AI.getPoint());

  }

  //Converts input to hand;
  public String nrToHand(int nr) {
    String hand = "";

    switch (nr) {
      case 1 -> {
        ui.printString("Rock");
        hand = "Rock";
      }
      case 2 -> {
        ui.printString("Paper");
        hand = "Paper";
      }
      case 3 -> {
        ui.printString("Scissors");
        hand = "Scissors";
      }
      default -> ui.printString("Put in an int between 1-3");

    }
    return hand;
  }
}
