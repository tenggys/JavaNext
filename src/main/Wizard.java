public class Wizard extends Unit {

    private boolean magic;

    public Wizard() {
        super( attack: 17, protect: 12, new int[]{-5, -5}, health: 30, speed: 9, state: "Stand");
        magic = true;
    }

    @Override
    public String toString() {
        return "Колдун " + super.toString() + ", магия, " + state;
    }
}
