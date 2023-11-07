import java.util.Scanner;

public class Game {
    // Main game loop, handles user input and calls player actions
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            // Print the game menu and handle the player's choices
            System.out.println("\nWelcome to the Game! Choose an action:");
            System.out.println("(1) Display Status");
            System.out.println("(2) Add Life");
            System.out.println("(3) Lose Life");
            System.out.println("(4) Add Coins");
            System.out.println("(5) Add Bombs");
            System.out.println("(6) Add Health Potions");
            System.out.println("(7) Use Coins");
            System.out.println("(8) Use Bomb");
            System.out.println("(9) Use Health Potion");
            System.out.println("(0) Quit");
            System.out.print("Enter your choice: ");

            // Process the player's menu selection
            input = scanner.nextLine();

            switch (input) {
                // Call corresponding player methods based on user input
                case "1":
                    player.displayStatus();
                    break;
                case "2":
                    player.addLife();
                    break;
                case "3":
                    player.loseLife();
                    break;
                case "4":
                    player.addCoins(requestAmount(scanner, "coins"));
                    break;
                case "5":
                    player.addBombs(requestAmount(scanner, "bombs"));
                    break;
                case "6":
                    player.addHealthPotions(requestAmount(scanner, "health potions"));
                    break;
                case "7":
                    player.useCoin(requestAmount(scanner, "coins to use"));
                    break;
                case "8":
                    player.useBomb();
                    break;
                case "9":
                    player.useHealthPotion();
                    break;
            }

            // Check if the player is still alive after each action
            if (!player.isAlive()) {
                System.out.println("Player has lost all life points. Game over.");
                break; // Exit the game loop if the player is not alive
            }

        } while (!input.equals("0"));
        scanner.close();
        // Display a different message if the game ended because of zero life
        if (player.isAlive()) {
            System.out.println("Game over. Thank you for playing!");
        } else {
            System.out.println("Game over. Try again!");
        }
    }

    private static int requestAmount(Scanner scanner, String item) {
        System.out.print("Enter the amount of " + item + ": ");
        return scanner.nextInt();
    }

}
