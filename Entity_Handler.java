public class Entity_Handler {

    protected int hp;
    protected int heart;
    protected int speed;
    protected int strength;
    protected boolean stunnedOrNot;
    private static final int initialHpValue = 10;

    public Entity_Handler(int hp, int speed, int strength) {
        this.hp = hp;
        this.heart = 3;
        this.speed = speed;
        this.strength = strength;
        this.stunnedOrNot = false;
    }

    public int getHp() {
        return this.hp;
    }

    public int getHeart() {
        return this.heart;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getStrength() {
        return this.strength;
    }

    public boolean getStunnedOrNot() {
        return this.stunnedOrNot;
    }

    public void handleDamage(int damage) {
        this.hp -= damage;
        if (this.hp <= 0) {
            this.heart--;
            if (this.heart > 0) {
                this.hp = initialHpValue;
            }
            this.stunnedOrNot = true;
        }
    }
}