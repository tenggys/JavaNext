package chars;

public class Spearman extends Unit {

    public Spearman(List<Unit> gang, List<Unit> side, int x, int y) {
        super( attack: 4, protect: 5, new int[]{1, 3}, health: 10, speed: 4, state: "Stand");
        super.position = new Vector2(x, y);
        super.side = side;
        quantity = new Random().nextInt(10, 15);
    }

    @Override
    public String getInfo() {
        return "Копейщик " + super.getInfo() + ", " + state;
    }

    public void step(){
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
            if (dist < 2){
                side.get(index).getHit(speed > dist ? calcDamage(side.get(index)));
            } else {
                Vector2 enemyPos = side.get(index).unit.getPosition();
                Vector2 newPos = new Vector2(x: 0, y: 0);
                if (enemyPos.y == position.y) {
                    newPos.y = position.y + 1;
                    if (position.x - enemyPos.x < 0) {
                        newPos.x = position.x + 1;
                    } else {
                        newPos.x = position.x - 1;
                    }
                } else {
                    newPos.x = position.x + 1;
                    if (enemyPos.y - position.y > 0) {
                        newPos.y = position.y - 1;
                    } else {
                        newPos.y = position.y - 1;
                    }
                }
                AtomicBoolean empty = true;
                gang.forEach(Unit -> {
                    if (unit.getPosition().isEquals(newPos)) {
                        empty = false;
                    }
                });
                if (empty) {
                    position = newPos;
                }
            }
        }
    }
}
