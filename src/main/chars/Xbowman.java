package chars;

public class Xbowman extends Unit{

    private int shots;

    public Xbowman(List<Unit> gang, List<Unit> side, int x, int y) {
        super( attack: 6, protect: 3, new int[]{2, 3}, health: 10, speed: 4, state: "Stand");
        shots = 16;
        super.gang = gang;
        super.position = new Vector2(x, y);
        super.side = side;
        quantity = new Random().nextInt(5, 8);
    }

    public void step() {
        for (Unit unit: super.gang) {
            if (unit.getName().equals("Крестьянин")){
                if (unit.getAction().equals("Занят") && !unit.getAction.equals("Мертв")){
                    shots++;
                    unit.setAction("Занят");
                    break;
                }
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

    public String getInfo() {
        return "Арбалетчик " + super.getInfo() + ", выстрелы: " + shots + ", " + state;
    }
}

