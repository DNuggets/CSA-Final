import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;
import java.io.FileReader;

/**
 * The Stats class is responsible for managing team information and providing methods to select teams
 * and simulate a game with user input and AI.
 */
public class Stats {

  private Team[] teamInfo;  // The 1D array of all of the teams' info

  /**
   * Constructor that initializes the teamInfo array using the createResponses method.
   */
  public Stats() {
    teamInfo = createResponses();
  }

  /**
   * Creates and returns a 1D array of Team objects using predefined data.
   * This method simulates reading data from various files.
   *
   * @return An array of Team objects.
   */
  public Team[] createResponses() {
    // Arrays containing data for teams, player names, and stats
    String[] teamsData = {
      "Atlanta Hawks", "Boston Celtics", "Brooklyn Nets", "Charlotte Hornets", "Chicago Bulls",
      "Cleveland Cavaliers", "Dallas Mavericks", "Denver Nuggets", "Detroit Pistons", "Golden State Warriors",
      "Houston Rockets", "Indiana Pacers", "Los Angeles Clippers", "Los Angeles Lakers", "Memphis Grizzlies",
      "Miami Heat", "Milwaukee Bucks", "Minnesota Timberwolves", "New Orleans Pelicans", "New York Knicks",
      "Oklahoma City Thunder", "Orlando Magic", "Philadelphia 76ers", "Phoenix Suns", "Portland Trail Blazers",
      "Sacramento Kings", "San Antonio Spurs", "Toronto Raptors", "Utah Jazz", "Washington Wizards"
    };
    String[] namesData = {
      "Trae Young", "Jayson Tatum", "Mikal Bridges", "Lamelo Ball", "Demar DeRozan", "Donavon Mitchell", 
      "Luka Doncic", "Nikola Jokic", "Cade Cunningham", "Stephen Curry", "Jalen Green", "Tyrese Haliburton", 
      "Paul George", "Lebron James", "Ja Morant", "Jimmy Butler", "Giannis Antetokounmpo", "Anthony Edwards", 
      "Zion Williamson", "Jalen Brunson", "Shai Gilgeous-Alexander", "Paolo Banchero", "Joel Embiid", "Devin Booker", 
      "Kevin Durant", "DeAaron Fox", "Victor Wembanyama", "Scottie Barnes", "Lauri Markkanen", "Jordan Poole"
    };
    Double[] threeptData = {
      0.45, 0.425, 0.40, 0.425, 0.35, 0.425, 0.425, 0.40, 0.40, 0.40, 0.495, 0.425, 0.425, 0.375, 0.375, 0.35, 
      0.325, 0.40, 0.325, 0.40, 0.40, 0.375, 0.40, 0.425, 0.40, 0.375, 0.375, 0.35, 0.425, 0.99
    };
    Double[] middyData = {
      0.40, 0.425, 0.375, 0.35, 0.475, 0.40, 0.425, 0.45, 0.375, 0.425, 0.35, 0.375, 0.425, 0.40, 0.375, 0.425, 
      0.35, 0.375, 0.35, 0.40, 0.45, 0.375, 0.425, 0.45, 0.425, 0.40, 0.40, 0.375, 0.375, 0.99
    };
    Double[] jamtimeData = {
      0.067, 0.567, 0.500, 0.433, 0.500, 0.600, 0.467, 0.467, 0.433, 0.200, 0.567, 0.267, 0.567, 0.600, 0.633, 
      0.500, 0.633, 0.600, 0.633, 0.200, 0.500, 0.567, 0.600, 0.467, 0.533, 0.500, 0.567, 0.533, 0.533, 0.99
    };

    Team[] tempResponses = new Team[teamsData.length];  // Temporary array to hold team objects
    // Loop through the data arrays and create Team objects
    for (int index = 0; index < tempResponses.length; index++) {
      tempResponses[index] = new Team(teamsData[index], namesData[index], threeptData[index], middyData[index], jamtimeData[index]);
    }
    return tempResponses;  // Return the array of team objects
  }

  /**
   * Prompts the user to select an NBA team to play as.
   *
   * @return The name of the selected team.
   */
  public String player1Prompt() {
    Scanner scanner = new Scanner(System.in);  // Scanner to read user input
    System.out.println("Welcome Player #1!");
    System.out.println("Choose the NBA team that you want to play as: ");
    String choice = scanner.nextLine();  // Read user's team choice
    scanner.close();  // Close the scanner
    return choice;  // Return the chosen team name
  }

  /**
   * Assigns and returns the Team object for the user's chosen team.
   *
   * @param teamName The name of the team chosen by the user.
   * @return The Team object corresponding to the chosen team, or null if not found.
   */
  public Team assignTeam1(String teamName) {
    // Loop through the teamInfo array to find the matching team
    for (int i = 0; i < teamInfo.length; i++) {
      if (teamName.equals(teamInfo[i].getPlayer().getTeam())) {
        System.out.println();
        System.out.println("You have selected " + teamInfo[i].getPlayer().getName() + " from the " + teamInfo[i].getPlayer().getTeam());
        System.out.println();
        return teamInfo[i];  // Return the matching team object
      }
    }
    return null;  // Return null if no matching team is found
  }

  /**
   * Randomly assigns and returns a Team object for the AI.
   *
   * @return A randomly selected Team object.
   */
  public Team assignTeam2() {
    Team team = new Team();  // Create a new Team object (not used in the method)
    int i = (int) (Math.random() * 30);  // Generate a random index to select a team
    System.out.println();
    System.out.println("AI has selected " + teamInfo[i].getPlayer().getName() + " from the " + teamInfo[i].getPlayer().getTeam());
    System.out.println();
    return teamInfo[i];  // Return the randomly selected team
  }

  /**
   * Returns a string containing the names of all the teams.
   *
   * @return A string with each team's name on a new line.
   */
  public String toString() {
    String result = "";  // Initialize an empty string to hold the result
    // Loop through the teamInfo array and append each team's name to the result string
    for (Team answer : teamInfo) {
      result += answer.getPlayer().getTeam() + "\n";
    }
    return result;  // Return the concatenated string of team names
  }
}