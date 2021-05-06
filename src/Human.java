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
    public int resetPoints() {
        points = 0;
        return 0;
    }


    @Override
    public int getPoint() {
        return points;
    }


}
