public class Game {
  UI ui = new UI();
  Player AI = new Computer();
  Player human = new Human();
  Menu menu = new Menu();


  public void run() {
    ui.ANSI_BLUE("Welcome to Rock Paper scissors");
    menu.printMenu();
    pickMenuOption();
  }


  public void pickMenuOption() {
    int choice = ui.scanInt();
    boolean run =true;
    do {
      switch (choice) {
        case 1 -> {
          ui.printString("Enter either Rock, Paper or Scissor");
          playGame();

        }
        case 2 -> {
          ui.ANSI_YELLOW("many stats, such wow");
          run();
        }
        case 3 -> {
          ui.printString("The machines have won");
         run();
        }
        case 4 -> {
          ui.ANSI_RED("OK....Bye");
          run =false;
        }
      }
    } while(run);



  }


  //Entire game consists of:
  //Setting human players name
  //Playing rounds until a winner has been found
  //displays the score

  public void playGame() {
    boolean run = true;
    do {
      //Player gets Hand move
      Hand player1 = getHand(human.takeTurn());
      while (player1 == null) {
        player1 = getHand(human.takeTurn());
      }
      Hand player2 = getHand(AI.takeTurn());
      while (player2 == null) {
        //AI randomizes move
        player2 = getHand(AI.takeTurn());
      }
      //AI plays string but player plays Hand???
      playRound(player1, player2);
      if (AI.getPoint() == 3 || human.getPoint() == 3) {
        run = false;
      }
    }
    while (run);

    checkWinner();
    resetPoints();
    run();
  }

  //Part of stats?
  public void checkWinner() {
    if (AI.getPoint() == 3) {
      ui.printString("AI won");

    } else {
      ui.printString("You won!");
    }
  }

  public void resetPoints() {
    human.resetPoints();
    AI.resetPoints();
  }

  //One round consists of:
  //Human hand
  //AI hand
  //Either returns a tie or a playerPoint
  public void playRound(Hand player1, Hand player2) {

    if (player2.equals(Hand.SCISSORS) && player1.equals(Hand.PAPER) || player2.equals(Hand.PAPER) && player1.equals(Hand.ROCK) ||
        player2.equals(Hand.ROCK) && player1.equals(Hand.SCISSORS)) {
      ui.ANSI_RED("Your move: " + player1 + " AI move: " + player2 + "\n");
      ui.ANSI_RED("Computer wins the round" + "\n");
      AI.addPoint();

    } else if (player1.equals(player2)) {
      ui.printString("Your move: " + player1 + " AI move: " + player2 + "\n");
      ui.printString("It's a tie");

    } else {
      ui.ANSI_GREEN("Your move: " + player1 + " AI move: " + player2 + "\n");
      ui.ANSI_GREEN("You win the round" + "\n");
      human.addPoint();
    }
    displayResult();

  }

  //Pretty self-explanatory
  public void displayResult() {
    ui.printString("Your score: " + human.getPoint() + " AI score: " + AI.getPoint());

  }

  //Should possibly be in class Human
  //Converts the hand from string to type Hand
  public Hand getHand(String move) {
    Hand hand = null;
    switch (move) {
      case "Rock" -> hand = Hand.ROCK;

      case "Paper" -> hand = Hand.PAPER;

      case "Scissor" -> hand = Hand.SCISSORS;

      default -> ui.printString("Enter either Rock, Paper or Scissor");
    }

    return hand;
  }
}