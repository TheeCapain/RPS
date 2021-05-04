package Players;

import java.util.Random;

public class Computer implements Player {
  private Random rand = new Random();
  private int nr;


  @Override
  public int getMove() {
   return nr = rand.nextInt();
  }
}
