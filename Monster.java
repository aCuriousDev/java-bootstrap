public class Monster {

    private String name;
    private int monsterHealth;
    private int hearts;

    public Monster(String name, int monsterHealth, int hearts) {
        this.name = name;
        this.monsterHealth = monsterHealth;
        this.hearts = hearts;
    }

    public String getName() {
        return this.name;
    }

    public int getMonsterHealth() {
        return this.monsterHealth;
    }

    public void decreaseHealth(int damage) {
        this.monsterHealth -= damage;
    }

    public int getHearts() {
        return this.hearts;
    }

    public void loseHearts() {
        this.hearts--;
    }

    public void attack(Player player) {
        if (player.isPlayerDead()) {
            System.out.println(this.name + " can't attack, " + player.getName() + " is already defeated.");
        } else {
            int playerDamage = player.getDamage();
            player.decreaseHealth(playerDamage);

            if (player.isPlayerDead()) {
                System.out.println(this.name + " has defeated " + player.getName() + ".");
            } else {
                System.out.println(this.name + " has attacked " + player.getName() + " for " + playerDamage + " damage.");
            }

            if (player.isPlayerDead() && player.getHearts() > 0) {
                player.getHearts();
                player.resetHealth(); // You should add a resetHealth() method in your Player class to reset the health when a player loses a heart.
                System.out.println(player.getName() + " has lost a heart. " + player.getHearts() + " hearts remaining.");
            }
        }
    }
}