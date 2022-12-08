package chars;

public class Peasant extends Unit{
    private boolean delivery;

    public Peasant(List<Unit> gang, List<Unit> side, int x, int y) {
        super( attack: 1, protect: 1, new int[]{0, 1}, health: 1, speed: 3, state: "Крестьянин");
        delivery = true;
        super.position = new Vector2(x, y);
        super.side = side;
        quantity = new Random().nextInt(1, 5);
    }

    @Override
    public void step(List<Unit> side){
        if(action.equals("Занят")){
            action = "Стоит";
        }
    }

    @Override
    public String getInfo() {
        return name + "->" + super.getInfo() + ", Доставка";
    }
}