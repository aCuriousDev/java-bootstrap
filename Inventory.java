public class Inventory {
    private int coins;
    private int bombs;
    private int healthPotions;

    private final int MAX_CAPACITY = 100; // Example of a max capacity for each item

    public Inventory() {
        this.coins = 0;
        this.bombs = 0;
        this.healthPotions = 0;
    }

    public void display() {
        System.out.println("Inventory - Coins: " + coins + " Bombs: " + bombs + " Health Potions: " + healthPotions);
    }

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

    // Additional getters and setters as needed...
}
