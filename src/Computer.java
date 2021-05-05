import java.util.Random;

public class Computer implements Player {
    private String move;
    private int points;


    @Override
    public String takeTurn() {
        String[] handMoves = {"Rock", "Paper", "Scissors"};
        String aiMove = handMoves[new Random().nextInt(handMoves.length)];
        return aiMove;
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
