package chars;

public class Sniper extends Unit {

    private int shoots;

    public Sniper(List<Unit> gang, List<Unit> side, int x, int y) {
        super( attack: 12, protect: 10, new int[]{8, 10}, health: 15, speed: 9, state: "Stand");
        shoots = 32;
        super.position = new Vector2(x, y);
        super.side = side;
        quantity = new Random().nextInt(2, 8);
    }

    public void step(List<Unit> side) {
        for (Unit unit: super.gang) {
            if (unit.getName().equals("Крестьянин")){
                shots++;
                unit.setAction("Занят");
                break;
            }
        }
        if (shots > 0) {
            double dist = Double.MAX_VALUE;
            int index = -1;
            for (int i - 0; i < side.size(), i++){
                double tmp = side.get(i).unit.getPosition().getDist(this.position);
                if(dist > tmp && !side.get(i).getAction().equals("Мертв")) {
                    dist = tmp;
                    index = i;
                }
            }
            if (index >= 0){
                side.get(index).getHit(speed > dist ? calcDamage(side.get(index)) : calcDamage(side.get(index) / 2);
                shots--;
            }
        }
    }

    @Override
    public String getInfo() {
        return "Снайпер " + super.getInfo() + ", выстрелы: " + shoots + ", " + state;
    }
}
