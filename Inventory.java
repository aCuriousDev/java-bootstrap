public class Inventory {
    // Current count of coins, bombs, and health potions in the inventory
    private int coins;
    private int bombs;
    private int healthPotions;

    // Maximum capacity for each item type in the inventory
    private final int MAX_CAPACITY = 100; 

    // Initialize inventory with zero items
    public Inventory() {
        this.coins = 0;
        this.bombs = 0;
        this.healthPotions = 0;
    }

    // Display the current count of all items in the inventory
    public void display() {
        System.out.println("Inventory - Coins: " + coins + " Bombs: " + bombs + " Health Potions: " + healthPotions);
    }

    // Add a specified amount of coins, bombs, or health potions to the inventory
    public void addCoins(int amount) {
        if (coins + amount <= MAX_CAPACITY) {
            coins += amount;
        } else {
            System.out.println("Cannot hold that many coins. Coins are at max capacity!");
        }
    }

    public void addBombs(int amount) {
        if (bombs + amount <= MAX_CAPACITY) {
            bombs += amount;
        } else {
            System.out.println("Cannot hold that many bombs. Bombs are at max capacity!");
        }
    }

    public void addHealthPotions(int amount) {
        if (healthPotions + amount <= MAX_CAPACITY) {
            healthPotions += amount;
        } else {
            System.out.println("Cannot hold that many health potions. Health potions are at max capacity!");
        }
    }

    // Use a specified amount of coins or a single bomb/health potion
    public void useCoins(int amount) {
        if (coins - amount >= 0) {
            coins -= amount;
        } else {
            System.out.println("Not enough coins!");
        }
    }

    public void useBombs() {
        if (bombs - 1 >= 0) {
            bombs--;
        } else {
            System.out.println("Out of bombs!");
        }
    }

    public void useHealthPotions() {
        if (healthPotions - 1 >= 0) {
            healthPotions--;
        } else {
            System.out.println("Out of health potions!");
        }
    }
}
