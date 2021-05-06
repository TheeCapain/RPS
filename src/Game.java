public class Game {
    UI ui = new UI();
    Player AI = new Computer();
    Player human = new Human();

    //Entire game consists of:
    //Setting human players name
    //Playing rounds until a winner has been found
    //displays the score

    public void playGame() {

        boolean run = true;
        do {
            playRound();
            if (AI.getPoint() == 3 || human.getPoint() == 3) {
                run = false;
            }
        } while (run);
    }

    //One round consists of:
    //Human hand
    //AI hand
    //Either returns a tie or a playerPoint

    public void playRound() {

        if (AI.takeTurn().equals("Rock") && human.takeTurn().equals("Scissors") || AI.takeTurn().equals("Paper") || human.takeTurn().equals("Rock") || AI.takeTurn().equals("Scissors") && human.takeTurn().equals("Paper")) {
            ui.printString("Human move: " + human.takeTurn() + " AI move: " + AI.takeTurn());
            ui.printString("Computer wins the round");
            AI.addPoint();

        } else if (AI.takeTurn().equals(human.takeTurn())) {
            ui.printString("Human move: " + human.takeTurn() + " AI move: " + AI.takeTurn());
            ui.printString("Its a tie");

        } else {
            ui.printString("Human move: " + human.takeTurn() + " AI move: " + AI.takeTurn());
            ui.printString("Human wins the round");
            human.addPoint();
        }
        displayResult();
    }

    //Pretty self-explanatory
    public void displayResult() {
        ui.printString("Human score: " + human.getPoint() + " AI score: " + AI.getPoint());

    }
}