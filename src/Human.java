public class Human implements Player {
  private int points;
  UI ui = new UI();


  @Override
  public String takeTurn() {
    String move = ui.scanString();
    return move;
  }

  @Override
  public void addPoint() {
    points++;
  }

  @Override
  public void resetPoints() {
    points = 0;
  }


  @Override
  public int getPoint() {
    return points;
  }


}
