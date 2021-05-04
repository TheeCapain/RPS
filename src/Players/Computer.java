package Players;

import java.util.Random;

public class Computer implements Player {
  private Random rand = new Random();
  private int aiHand;

  public int getMove() {
    this.aiHand = rand.nextInt() + 3;
    return aiHand;
  }


  @Override
  public void getMove(int hand) {

  }
}
