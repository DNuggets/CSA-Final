import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;
import java.io.FileReader;

public class Stats{

  private Player[] teamInfo;    // The 1D array of all of the teams' info

  /*
   * Reads the data from teamsFile, locationsFile, arenasFile, capacitiesFile, championshipsFile, inSeasonTournamentChampionshipsFile to initialize team infos
   */
  public Stats(String teamsFile, String namesFile, String threeptFile, String middyFile, String jamtimeFile) {
    teamInfo = createResponses(teamsFile, namesFile, threeptFile, middyFile, jamtimeFile);
  }

  /*
   * Returns a 1D array of team objects using the data from teamsFile, locationsFile, arenasFile, capacitiesFile, championshipsFile, inSeasonTournamentChampionshipsFile
   * Precondition: all strings taken in are valid file names
   * Postcondition: must input each line of the respective file into their own index of their respective array
   */
  public Player[] createResponses(String teamsFile, String namesFile, String threeptFile, String middyFile, String jamtimeFile) {  
    String[] teamsData = FileReader.toStringArray(teamsFile);
    String[] namesData = FileReader.toStringArray(namesFile);
    Double[] threeptData = FileReader.toDoubleArray(threeptFile);
    Double[] middyData = FileReader.toDoubleArray(middyFile);
    Double[] jamtimeData = FileReader.toDoubleArray(jamtimeFile);
    
    
    Player[] tempResponses = new Player[teamsData.length];
    for (int index = 0; index < tempResponses.length; index++) {
      tempResponses[index] = new Player(teamsData[index], namesData[index], threeptData[index], middyData[index], jamtimeData[index]);
    }
    return tempResponses;
  }
  
  /*
   * Prompts the user to enter the amount of championships they want their perspective advertising partner team to have (for credibility of team's following)
     * Precondition: must have Scanner class imported in file previously 
   * Postcondition: must prompt the user with a string question, and assign the user inputted string to the choice variable
   */
  public String player1Prompt() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Player1!");
    System.out.println("Choose the NBA team that you want to play as: ");
    String choice = scanner.nextLine();
    scanner.close();
    return choice;
  }

  public String player2Prompt() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Player2!");
    System.out.println("Choose the NBA team that you want to play as: ");
    String choice = scanner.nextLine();
    scanner.close();
    return choice;
  }

  public Player assignTeam(String teamName) {
    for (int i =0; i<teamInfo.length; i++) {
      if (teamName.equals(teamInfo[i].getTeam())){
        return teamInfo[i];
      }
    }
    return null;
  }


  /*
   * Returns a String containing each team's information
   */
  public String toString() {
    String result = "";

    for (Player answer : teamInfo) {
      result += answer + "\n";
    }

    return result;
  }
  
}
