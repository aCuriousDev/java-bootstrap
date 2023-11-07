public class Player {
    private int life; // Tracks the life points of the player
    private Inventory inventory; // The player's inventory of items

    // Initializes player with starting life and a new inventory
    public Player() {
        this.life = 3; // Starting life
        this.inventory = new Inventory();
    }

    // Displays the current status of the player including life and inventory items
    public void displayStatus() {
        System.out.println("Player Life: " + life);
        inventory.display();
    }

    // Increases player life by one, up to a maximum of 5
    public void addLife() {
        if (life < 5) {
            life++;
        } else {
            System.out.println("Player life is already at maximum!");
        }
    }

    // Decreases player life by one, cannot go below 0
    public void loseLife() {
        if (life > 0) {
            life--;
        } else {
            System.out.println("Player cannot lose more life!");
        }
    }

    // Delegate methods to inventory: add coins, bombs, health potions, or use them
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
}