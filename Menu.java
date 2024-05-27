
import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;

public class Menu {

  private Player[] teamInfo;    // The 1D array of all of the teams' info

  /*
   * Reads the data from teamsFile, locationsFile, arenasFile, capacitiesFile, championshipsFile, inSeasonTournamentChampionshipsFile to initialize team infos
   */
  public Menu(String teamsFile, String namesFile, String threeptFile, String middyFile, String jamtimeFile) {
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
   * Counts the amount of teams that have won the inputted amount of championships, and returns amount of teams in the league with the amount of championships inputted
   * Precondition: championshipsService must be a valid integer greater than or equal to 0
   * Postcondition: must output the number of teams that have the specified amount of nba championships
   */
  public int countNumChampionships(String championshipsService) {
    int count = 0;
    for (TeamInfo answer : teamInfo) {
      if (championshipsService.equals(answer.getChampionships())){
        count++;
      }
    }
    return count;
  }
  /* Finds if any team is actually at the given city location, and then returns the info of the team if there is a team at the city location inputted
   * Precondition: takes in a valid string, with a city name
   * Postcondition: must output the information of any team that has a home arena in the specified city
   */
  public String teamsAtLocation(String teamLocation) {
    String teamAtLocation = "";
    for (int index = 0; index < teamInfo.length; index++) {
      if (teamLocation.equals(teamInfo[index].getLocations())){
        teamAtLocation += teamInfo[index].getTeams();
        teamAtLocation += ", " + teamInfo[index].getArenas();
        teamAtLocation += ", " + teamInfo[index].getLocations();
        teamAtLocation += ", " + teamInfo[index].getChampionships() + " Championships";
      }
    }
    return teamAtLocation;
  }

  /*
   * Prompts the user to enter the amount of championships they want their perspective advertising partner team to have (for credibility of team's following)
     * Precondition: must have Scanner class imported in file previously 
   * Postcondition: must prompt the user with a string question, and assign the user inputted string to the choice variable
   */
  public String promptUserNumChamps() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of championships that you are looking for in your prospective team in which you planning to advertise in, and we will tell you the amount of teams with that number of championships in the league: ");
    String choice = scanner.nextLine();
    scanner.close();
    return choice;
  }

  
  /*
   * Prompts the user to enter a city that they want to advertise in, and returns the name of the team at the city if there is actually a team at that city location
   * Precondition: must have Scanner class imported in file previously 
   * Postcondition: must prompt the user with a string question, and assign the user inputted string to the choice variable
   */
  public String promptUserTeamLocation() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the City of your prospective team in which you are planning to advertise in, and we will tell you the names of the teams at that city: ");
    String choice = scanner.nextLine();
    scanner.close();
    return choice;
  }


  /*
   * Returns a String containing each team's information
   */
  public String toString() {
    String result = "";

    for (TeamInfo answer : teamInfo) {
      result += answer + "\n";
    }

    return result;
  }
  
}

