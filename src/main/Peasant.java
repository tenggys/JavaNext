public class Peasant extends Unit{
    private boolean delivery;

    public Peasant() {
        super( attack: 1, protect: 1, new int[]{0, 1}, health: 1, speed: 3, state: "Stand");
        delivery = true;
    }

    @Override
    public String getInfo() {
        return "Крестьянин " + super.getInfo() + ", доставка, " + state;
    }
}