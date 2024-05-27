import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {
    Player player1 = new Player();
    Player player2 = new Player();
    
    //inputs the data of the teams into their respective objects from their data files
    Stats teaminfo = new Stats("teams.txt", "names.txt", "threept.txt", "middy.txt", "jamtime.txt");
    
    //prints out the toString() method showing all the user all of the info of all of the teams
    System.out.println(teaminfo);

    //prompts the user to input the number of championships they want the team that they are advertising with to have, and outputs the amount teams that have the inputted amount of championships (method 1)
    String userResponse1 = teaminfo.player1Prompt();
    player1 = teaminfo.assignTeam(userResponse1);

    //prompts the user to input the number of championships they want the team that they are advertising with to have, and outputs the amount teams that have the inputted amount of championships (method 1)
    String userResponse2 = teaminfo.player2Prompt();
    player2 = teaminfo.assignTeam(userResponse2);

  }
}
