package chars;

public abstract class Unit implements UnitInterface {
    protected int attack;
    protected int protect;
    protected int[] damage;
    protected float health;
    protected final float maxHealth;
    protected int speed;
    protected String state;

    protected List<Unit> gang;
    protected Vector2 position;


    public Unit(int attack, int protect, int[] damage, float health, int speed, String state) {
        this.attack = attack;
        this.protect = protect;
        this.damage = damage;
        this.health = health / 2;
        this.maxHealth = health;
        this.speed = speed;
        this.state = state;
        this.name = name;
    }

    public String getName() {
        return Name;
    }

    g
    public Vector2 getPosition() {
        return position;
    }

    @Override
    public String getInfo() {
        return "А:" + attack + ", З:" + protect + ", У:" + (damage[0] + damage[1]) / 2 + ", Зд:" + health + ", С:" + speed;
    }

    @Override
    public void step(List<Base> gang) {
        int index = 0;
        float dist = Float.MAX_VALUE;
        for (int i = 0; i < ; i++) {
            if (....){
                index = i;
                dist = ...
            }
        }
        position.x++;
    }
}
