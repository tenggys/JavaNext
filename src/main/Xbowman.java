public class Xbowman extends Unit{

    private int shoots;

    public Xbowman() {
        super( attack: 6, protect: 3, new int[]{2, 3}, health: 10, speed: 4, state: "Stand");
        shoots = 16;
    }

    public String toString() {
        return "Арбалетчик " + super.toString() + ", выстрелы: " + shoots + ", " + state;
    }
}
