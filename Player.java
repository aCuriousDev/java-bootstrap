public class Player {
    private int life;
    private Inventory inventory;

    public Player() {
        this.life = 3; // Starting life
        this.inventory = new Inventory();
    }

    public void displayStatus() {
        System.out.println("Player Life: " + life);
        inventory.display();
    }

    public void addLife() {
        if (life < 5) {
            life++;
        } else {
            System.out.println("Player life is already at maximum!");
        }
    }

    public void loseLife() {
        if (life > 0) {
            life--;
        } else {
            System.out.println("Player cannot lose more life!");
        }
    }

    // Delegate inventory management to the Inventory object
    public void addCoins(int amount) {
        inventory.addCoins(amount);
    }

    public void addBombs(int amount) {
        inventory.addBombs(amount);
    }

    public void addHealthPotions(int amount) {
        inventory.addHealthPotions(amount);
    }

    public void useCoin(int amount) {
        inventory.useCoins(amount);
    }

    public void useBomb() {
        inventory.useBombs();
    }

    public void useHealthPotion() {
        inventory.useHealthPotions();
    }

    // Getters and setters for life and inventory as needed...
}
