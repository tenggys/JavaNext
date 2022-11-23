public class Monk extends Unit {

    private boolean magic;

    public Monk() {
        super( attack: 12, protect: 7, new int[]{-4, -4}, health: 30, speed: 5, state: "Stand");
        magic = true;
    }

    @Override
    public String toString() {
        return "Монах " + super.toString() + ", магия, " + state;
    }
}
