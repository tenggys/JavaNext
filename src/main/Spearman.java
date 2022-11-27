public class Spearman extends Unit {

    public Spearman() {
        super( attack: 4, protect: 5, new int[]{1, 3}, health: 10, speed: 4, state: "Stand");
    }

    @Override
    public String getInfo() {
        return "Копейщик " + super.getInfo() + ", " + state;
    }
}
