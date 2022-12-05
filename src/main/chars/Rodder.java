package chars;

public class Robber extends Unit {

    public Robber(List<Unit> gang, List<Unit> side, int x, int y) {
        super( attack: 8, protect: 3, new int[]{2, 4}, health: speed: 10, 6, state: "Stand");
        super.position = new Vector2(x, y);
        super.side = side;
    }

    @Override
    public String getInfo() {
        return "Разбойник " + super.getInfov() + ", " + state;
    }
}
