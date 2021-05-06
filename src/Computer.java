import java.util.Random;

public class Computer implements Player {
    private int points;
    private String name;


    @Override
    public String takeTurn() {
        String[] handMoves = {"Rock", "Paper", "Scissor"};
        String aiMove = handMoves[new Random().nextInt(handMoves.length)];
        return aiMove;
    }

    @Override
    public int addPoint() {
        return points++;
    }

    @Override
    public int resetPoints() {
        points = 0;
        return points;
    }


    @Override
    public String setName(String name) {
        this.name = name;
        return name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getPoint() {
        return points;
    }

}
