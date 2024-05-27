import java.util.Scanner;

/**
 * Handles user interactions for selecting game modes.
 */
public class Menu {
    private Scanner scanner;  // Scanner for input handling.

    /**
     * Constructor initializes the scanner for user input.
     * Preconditions: None
     * Postconditions: Scanner is ready for use.
     */
    public Menu() {
        scanner = new Scanner(System.in);
    }

    /**
     * Displays the main menu and captures user choice of game mode.
     * Preconditions: None
     * Postconditions: Returns the user's game mode choice as an integer.
     * @return int representing the chosen game mode (1 or 2), returns -1 if invalid input.
     */
    public int displayMenu() {
        // Print the welcome message and game mode options
        System.out.println("Welcome to the NBA JAMTOWN!");
        System.out.println();
        System.out.println("Choose your Game Mode:");
        System.out.println("1 - Up to 11 Points (Win by 2)");
        System.out.println("2 - Sudden Death (First to score wins)");
        System.out.println();
        System.out.print("Enter your choice of game mode [1 or 2]: ");

        int choice = scanner.nextInt();  // Captures user's choice.
        
        // Check if the choice is valid (either 1 or 2)
        if (choice == 1 || choice == 2) {
            return choice;  // Return the valid choice
        } else {
            // Print an error message and recursively prompt the user again
            System.out.println("Invalid choice. Please enter 1 or 2.");
            return displayMenu();  // Recursive call if choice is invalid.
        }
    }
}