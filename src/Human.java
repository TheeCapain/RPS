public class Human implements Player {
    private String name;
    private int points;
    UI ui = new UI();

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName() {
        return name;
    }

    public String humanMove() {
        String hand = "";

        switch (takeTurn()) {
            case "Rock" -> {
                ui.printString("Rock");
                hand = "Rock";
            }
            case "Paper" -> {
                ui.printString("Paper");
                hand = "Paper";
            }
            case "Scissors" -> {
                ui.printString("Scissors");
                hand = "Scissors";
            }
            default -> ui.printString("Put in an int between 1-3");

        }
        return hand;
    }

    @Override
    public String takeTurn() {
        String move = ui.scanString();
        return move;
    }

    @Override
    public int addPoint() {
        return points++;
    }

    @Override
    public int getPoint() {
        return points;
    }
}
