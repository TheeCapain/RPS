public class Statistics {
    private final int[] mostUsedHand = new int[3];
    private final String[] hands = {"Rock", "Paper", "Scissors"};
    UI ui = new UI();

    public void countUsedHand(Hand hand) {
        if (hand.equals(Hand.ROCK)) {
            mostUsedHand[0]++;
        } else if (hand.equals(Hand.PAPER)) {
            mostUsedHand[1]++;
        } else if (hand.equals(Hand.SCISSORS)) {
            mostUsedHand[2]++;
        }
    }

    public void printMostUsedHands() {
        for (int i = 0; i < mostUsedHand.length; i++) {

            ui.printStats(hands[i] + ": ", mostUsedHand[i]);
        }
    }
}
