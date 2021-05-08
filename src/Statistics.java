public class Statistics {
    private final int[] mostUsedHand = new int[4];
    private final String[] hands = {"Rock", "Paper", "Scissors", "Secret weapon"};
    UI ui = new UI();

    public void countUsedHand(Hand hand) {
        if (hand.equals(Hand.ROCK)) {
            mostUsedHand[0]++;
        } else if (hand.equals(Hand.PAPER)) {
            mostUsedHand[1]++;
        } else if (hand.equals(Hand.SCISSORS)) {
            mostUsedHand[2]++;
        } else if (hand.equals(Hand.SPECIAL)){
            mostUsedHand[3]++;
        }
    }

    public void printMostUsedHands() {
        ui.printString("----------------------------------------");
        ui.printString("Times used:");

        for (int i = 0; i < mostUsedHand.length; i++) {
            ui.printStats(hands[i] + ": ", mostUsedHand[i]);
        }
        ui.printString("----------------------------------------");
    }
}
