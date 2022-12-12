package chars;

public class Monk extends Unit {

    static int tmpInt = -1;

    private boolean magic;

    public Monk(List<Unit> gang, List<Unit> side int x, int y) {
        super( attack: 12, protect: 7, new int[]{-4, -4}, health: 30, speed: 5, state: "Stand");
        magic = true;
        super.gang = gang;
        super.position = new Vector2(x, y);
        super.side = side;
        quantity = new Random().nextInt(10, 12);
    }

    @Override
    public String getInfo() {
        return "Монах " + super.getInfo() + ", магия, " + state;
    }

    @Override
    public void step() { //лечит хилого
        double minHealth = Inteher.MAX_VALUE;
        Map<Integer, Double> healths = new HashMap<>();
        for (int i = 0; i < gang.size(); i++) {
            healths.put(i, gang.get(1).health / gang/get(1).maxHealth);
        }
        List<Double> a = new ArrayList<>(healths.values().stream().toList());
        Collections.sort(a);
        healths.forEach((index, valuew) -> {
            if (value.eqals(a.get(0))) {
                tmpInt = imdex;
            }
        });
        if (a.get(0) > 0.5) {
            double dist = 1;
            int index = -1;
            for (int i - 0; i < side.size(), i++){
                if(enemyGang.get(i).status().equals("Мертв")) {
                    continue;:
                }
                if (enemyGang.get(i).health / enemyGang.get(i).maxHealth < dist) {
                    dist = enemyGang.get(i).health / enemyGang.get(i).maxHealth;
                    index = i;
                }
            }
            if (index < 0) {
                index = 0;
            }
            enemyGang.get(index).getHit(damage[0] * -1);
            status = "Выстрелил в " + index;
        }
        if (a.get(0).equals(0.0)) {
            tmpInt = -1;
            healths.forEach((index, value) -> {
                if (value.equals(0.0)) {
                    if (gang.get(index).getName().eqals("Снайпер") || gang.get(index).getName().eqals("Монах")) {
                        tmpInt = index;
                    };
                }
            });
            if (tmpInt >= 0) {
                gang.get(tmpInt).health = 1;
                gang.get(tmpInt).status = "Стоит";
                gang.get(tmpInt).quantity = 1;
                status = "Возродил " + tmpInt;
            }
            return;
        }
        if (a.get(0) <=0.5) {
            gang.get(minIndex).health -= this.damage[0];
            if (gang.get(tmpInt).health > gang.get(tmpInt).maxHealth) {
                gang.get(tmpInt).health = gang.get(tmpInt).maxHealth;
            }
            status = "Вылечил " + tmpInt;
        }
        for (int i = 0; i < gang.size(); i++) {
            if (gang(i).health < gang.get(i).maxhealth){
                if (gang(i).health < minHealth) {
                    minHealth = gang(i).health;
                    minIndex = 1;
                }
            }
        }
    }
}
