public class Wizard extends Unit {

    private boolean magic;

    public Wizard(List<Unit> gang) {
        super( attack: 17, protect: 12, new int[]{-5, -5}, health: 30, speed: 9, state: "Stand");
        magic = true;
        super.gang = gang;
    }

    @Override
    public String getInfo() {
        return "Колдун " + super.getInfo() + ", магия, " + state;
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

