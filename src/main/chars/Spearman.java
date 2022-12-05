package chars;

public class Spearman extends Unit {

    public Spearman(List<Unit> gang, List<Unit> side, int x, int y) {
        super( attack: 4, protect: 5, new int[]{1, 3}, health: 10, speed: 4, state: "Stand");
        super.position = new Vector2(x, y);
        super.side = side;
    }

    @Override
    public String getInfo() {
        return "Копейщик " + super.getInfo() + ", " + state;
    }
}
