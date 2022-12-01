package chars;

public class Sniper extends Unit {

    private int shoots;

    public Sniper(, int x, int y) {
        super( attack: 12, protect: 10, new int[]{8, 10}, health: 15, speed: 9, state: "Stand");
        shoots = 32;
        super.position = new Vector2(x, y);
    }

    @Override
    public String getInfo() {
        return "Снайпер " + super.getInfo() + ", выстрелы: " + shoots + ", " + state;
    }
}