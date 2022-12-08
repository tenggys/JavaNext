package chars;

public abstract class Unit implements UnitInterface {
    protected int attack;
    protected int protect;
    protected int[] damage;
    protected float health;
    protected final float maxHealth;
    protected int speed;
    protected String action;
    protected String state;

    protected List<Unit> gang, side;
    protected Vector2 position;

    protected int quantity;


    public Unit(int attack, int protect, int[] damage, float health, int speed, String state) {
        this.attack = attack;
        this.protect = protect;
        this.damage = damage;
        this.maxHealth = health;
        this.speed = speed;
        this.state = state;
        this.name = name;
        this.actiom = "Стоит";
        quanity = new Random().nextInt(1, 21);
        this.health = health * quantity;
    }

    public String getName() {
        return Name;
    }

    public void setAction(String action){
        this.action = action;
    }

    public String getAction(String action){
        return action;
    }

    public int getSpeed(){
        return speed;
    }

    public double getDamage(Unit enemy){
        int d = enemy.defance - attack;
        if (d == 0){
            return ((this.damage[0] + this.damage[1]) / 2.0) * quantity;
        } else if (d < 0) {
            return this.damage[0] * quantity;
        } else {
            return this.damage[1] * quantity;
        }
    }

    public void getHit(float damage) {
        dubles = (quantity - 1) * maxHealth + health;
        tmpHealth -= damage;
        if (tmpHealth <= 0) {
            this.health = 0;
            this.action = "Мертв";
            quantity = 0;
        } else {
            tmpHealth = (int) (tmpHealth / maxHealth);
            health = maxHealth;
            if (tmpHealth % maxHealth > 0) {
                quantity++;
                health = tmpHealth % maxHealth;
            }
        }
    }

    g
    public Vector2 getPosition() {
        return position;
    }

    @Override
    public String getInfo() {
        return "А:" + attack + ", З:" + protect + ", У:" + (damage[0] + damage[1]) / 2 + ", Зд:" + health + ", С:" + speed + ", " + action;
    }

    @Override
    public void step(List<Unit> gang) {
//        int index = 0;
//        float dist = Float.MAX_VALUE;
//        for (int i = 0; i < ; i++) {
//            if (....){
//                index = i;
//                dist = ...
//            }
//        }
//        position.x++;
    }
}
