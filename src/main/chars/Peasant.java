package chars;

public class Peasant extends Unit{
    private boolean delivery;

    public Peasant(, int x, int y) {
        super( attack: 1, protect: 1, new int[]{0, 1}, health: 1, speed: 3, state: "Stand");
        delivery = true;
        super.position = new Vector2(x, y);
    }

    @Override
    public String getInfo() {
        return "Крестьянин " + super.getInfo() + ", доставка, " + state;
    }
}