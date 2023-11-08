public class Fight {
    
    private int damageDone;
    private int health;

    public Fight(int damageDone, int health) {
        if (damageDone >= this.health && health <= 0) {
            this.health = 0;
        }
    }
}