import java.util.*;

// à revoir complètement, le code n'est plus satisfaisant par rapport à la class Player

public class LevelTest extends Player {

    protected int enemyLife = 1;
    protected int numberOfEnemies = 3;
    protected List<String> enemies;
    protected Player player;

    public LevelTest(String name, int playerHealth, int damage) {
        super(name, playerHealth, damage);

        enemies = new ArrayList<String>();
        enemies.add("Warrior");
        enemies.add("Healer");
        enemies.add("Boss");

        player = new Player(name, playerHealth, damage);

        // In the idea, I would like that if one or more conditions are met, the level
        // is completed with a congratulations message before moving on to another
        // possible level.
        // We have three different enemies --> if all three are defeated == success!
        // If the character finds the cell with the door == success!
    }
    
    public void playLevel() {
        while (!isLevelComplete() && !player.isPlayerDead()) {
            int enemyDamage = calculateEnemyDamage();
            player.attack(enemyDamage);

            if (player.isPlayerDead()) {
                System.out.println("Game over!");
                return;
            }

            if (isLevelComplete()) {
                levelUpPlayer();
                System.out.println("Congratulations! You have completed the level!");
            }
        }
    }

    public boolean isLevelComplete() {
        return (enemyLife == 0 && numberOfEnemies == 0);
    }

    public void levelUpPlayer() {
        player.gainLife();
    }

    public int calculateEnemyDamage() {
        int minDamage = 5; // Minimum possible damage
        int maxDamage = 15; // Maximum possible damage
        return minDamage + (int) (Math.random() * (maxDamage - minDamage + 1));
    }

    public static void main(String[] args) {
        LevelTest level = new LevelTest("YourName", 10, 5);
        level.playLevel();
    }
}