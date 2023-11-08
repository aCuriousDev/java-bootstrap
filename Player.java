public class Player {

    private String name;
    private int damage;
    private int hearts;
    private int playerHealth;
    private boolean isDead = false;

    public Player(String name, int hearts, int damage) {
        this.name = name;
        this.damage = damage;
        this.hearts = hearts;
        this.playerHealth = hearts * 10;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHearts() {
        return hearts;
    }

    public boolean isPlayerDead() {
        return isDead;
    }

    public void attack(int enemyDamage) {
        if (!isDead) {
            playerHealth -= enemyDamage;

            if (playerHealth <= 0) {
                if (hearts > 0) {
                    hearts--;
                    playerHealth = hearts * 10; // A chaque coeur, je veux une barre de vie qui redémarre à 0.
                    System.out.println(name + " has lost a heart. " + hearts + " hearts remaining.");
                } else {
                    isDead = true;
                    System.out.println(name + " is defeated.");
                }
            } else {
                System.out.println(name + " has " + playerHealth + " remaining health.");
            }
        } else {
            System.out.println(name + " is already defeated.");
        }
    }

    public void gainLife() {
        if (playerHealth < hearts * 10) { // Ensure health doesn't exceed maximum
            playerHealth++;
            System.out.println(name + " has gained an extra life. Total health: " + playerHealth);
        }
    }
    public void resetHealth() {
        playerHealth = hearts * 10;
    }

    public void decreaseHealth(int playerDamage) {
    }
}