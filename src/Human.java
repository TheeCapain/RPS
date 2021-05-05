public class Human implements Player {
private String name;
private int points;
UI ui = new UI();
  public void setName(String name) {
    this.name = name;

  }

  public String getName() {
    return name;
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
