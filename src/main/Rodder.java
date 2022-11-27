public class Robber extends Unit {

    public Robber() {
        super( attack: 8, protect: 3, new int[]{2, 4}, health: speed: 10, 6, state: "Stand");
    }

    @Override
    public String getInfo() {
        return "Разбойник " + super.getInfo() + ", " + state;
    }
}
