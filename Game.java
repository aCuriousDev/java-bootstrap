import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
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

            input = scanner.nextLine();

            switch (input) {
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
        } while (!input.equals("0"));

        scanner.close();
        System.out.println("Game over. Thank you for playing!");
    }

    private static int requestAmount(Scanner scanner, String item) {
        System.out.print("Enter the amount of " + item + ": ");
        return scanner.nextInt();
    }

}
