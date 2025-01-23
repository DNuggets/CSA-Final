import java.util.Scanner;

/**
 * Entry point of the application that orchestrates gameplay setup and progression.
 */
public class DataRunner {
  /**
   * The main method initializes the game, sets up the teams, and starts the selected game mode.
   * Preconditions: None
   * Postconditions: The game is started and progresses based on user input.
   * @param args Command line arguments (not used in this application).
   */
  public static void main(String[] args) {
    Team player1 = new Team();  // Creates an instance of Team for player1.
    Team player2 = new Team();  // Creates an instance of Team for player2.
    Menu menu = new Menu();  // Creates an instance of Menu for user interactions.

    Stats teaminfo = new Stats();  // Initializes team data from predefined sources.
    
    // Display all team information to the user
    System.out.println("Choose your team from the following: ");
    System.out.println();
    System.out.println(teaminfo.toString());  // Calls the toString method of Stats to display team info.

    String userResponse1 = teaminfo.player1Prompt();  // Asks user to select their team.
    player1 = teaminfo.assignTeam1(userResponse1);  // Assigns the selected team to player1.

    player2 = teaminfo.assignTeam2();  // Automatically assigns a team to player2 (AI).
    
    int choice = menu.displayMenu();  // Displays menu and gets user choice of game mode.
    if (choice == 1) {
      FirstTo ft = new FirstTo();
      ft.upTo11Points(player1, player2);  // Starts a game where the first to 11 points wins.
    } else {
      SuddenDeath sd = new SuddenDeath();
      sd.playSuddenDeath(player1, player2);  // Starts a sudden death game mode.
    }
  }
}