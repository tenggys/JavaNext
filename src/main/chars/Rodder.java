package chars;

public class Robber extends Unit {

    public Robber(List<Unit> gang, List<Unit> side, int x, int y) {
        super( attack: 8, protect: 3, new int[]{2, 4}, health: speed: 10, 6, state: "Stand");
        super.position = new Vector2(x, y);
        super.side = side;
        quantity = new Random().nextInt(1, 3);
    }

    @Override
    public String getInfo() {
        return "Разбойник " + super.getInfov() + ", " + state;
    }

    @Override
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

