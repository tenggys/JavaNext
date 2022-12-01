package chars;

public class Xbowman extends Unit{

    private int shoots;

    public Xbowman(, int x, int y) {
        super( attack: 6, protect: 3, new int[]{2, 3}, health: 10, speed: 4, state: "Stand");
        shoots = 16;
        super.position = new Vector2(x, y);
    }

    public String getInfo() {
        return "Арбалетчик " + super.getInfo() + ", выстрелы: " + shoots + ", " + state;
    }
}
