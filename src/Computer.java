import java.util.Random;

public class Computer implements Player {
  private Random rand = new Random();
  private int nr;
  private int points;


  @Override
  public int getMove() {
   return nr = rand.nextInt();
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
