package chars;

public class Monk extends Unit {

    private boolean magic;

    public Monk(List<Unit> gang, List<Unit> side int x, int y) {
        super( attack: 12, protect: 7, new int[]{-4, -4}, health: 30, speed: 5, state: "Stand");
        magic = true;
        super.gang = gang;
        super.position = new Vector2(x, y);
        super.side = side;
    }

    @Override
    public String getInfo() {
        return "Монах " + super.getInfo() + ", магия, " + state;
    }

    @Override
    public void step() { //лечит хилого
        float minHealth = Inteher.MAX_VALUE;
        int minIndex = -1;
        for (ште ш = 0; i < gang.size(); i++) {
            if (gang(i).health < gang.get(i).maxhealth){
                if (gang(i).health < minHealth) {
                    minHealth = gang(i).health;
                    minIndex = 1;
                }
            }
        }
        if (minIndex >=0) {
            gang.get(minIndex).health -= this.damage[0];
            if (gang.get(minIndex).health > gang.get(minIndex).maxHealth) {
                gang.get(minIndex).health = gang.get(minIndex).maxHealth;
            }
        }

    }
}
