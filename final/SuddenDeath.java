/**
 * The SuddenDeath class extends the Team class and represents a game mode
 * where the next point wins the game.
 */
public class SuddenDeath extends Team {

    /**
     * Simulates a sudden death game where the first team to score wins the game.
     *
     * @param team1 The first team.
     * @param team2 The second team.
     */
    public void playSuddenDeath(Team team1, Team team2) {
      System.out.println();
      System.out.println("Game Mode Selected: Sudden Death (next point wins)");
      System.out.println();
  
      // Continue the game until one of the teams scores
      while (team1.getScore() == 0 && team2.getScore() == 0) {
        team1.playerMove(); // Player move for team1
        team2.aiMove(); // AI move for team2
  
        System.out.println();
        System.out.println("Current Score: |" + team1.getPlayer().getName() + ": " + team1.getScore() + "| vs |" + team2.getPlayer().getName() + ": " + team2.getScore() + "|");
        System.out.println();
  
        // Check if team1 has scored
        if (team1.getScore() > 0) {
          System.out.println();
          System.out.println("What an incredible win! " + team1.getName() + " takes it all!");
          System.out.println();
        }
        // Check if team2 has scored
        else if (team2.getScore() > 0) {
          System.out.println();
          System.out.println("Good effort, but a loss is a loss, no matter how close! " + team2.getName() + " has just beat you!");
          System.out.println();
        }
      }
    }
  }