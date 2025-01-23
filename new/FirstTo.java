/**
 * The FirstTo class extends the Team class and represents a game mode where the first team
 * to reach 11 points (winning by at least 2 points) wins the game.
 */
public class FirstTo extends Team {

    /**
     * Simulates a game where two teams play until one team reaches 11 points and wins by at least 2 points.
     *
     * @param team1 The first team.
     * @param team2 The second team.
     */
    public void upTo11Points(Team team1, Team team2) {
      System.out.println();
      System.out.println("Game mode: First to 11 Points (win by 2)");
      System.out.println();
  
      int winningScore = 11;  // Points needed to win
      boolean isGameOver = false;  // Flag to check if game is over
  
      while (!isGameOver) {  // Continue the game until someone wins
        int score1 = team1.getScore();  // Get score of team1
        int score2 = team2.getScore();  // Get score of team2
  
        // Check if team1 has won
        if (Math.abs(score1 - score2) >= 2 && (score1 >= winningScore && score1 >= score2)) {
          isGameOver = true;  // Set flag to true to end the game
          System.out.println();
          System.out.println("What an incredible win! " + team1.getName() + " takes it all!");
          System.out.println();
        }
        // Check if team2 has won
        else if (Math.abs(score1 - score2) >= 2 && (score2 >= winningScore && score2 >= score1)) {
          isGameOver = true;  // Set flag to true to end the game
          System.out.println();
          System.out.println("Good effort, but a loss is a loss, no matter how close! " + team2.getName() + " has just beat you!");
          System.out.println();
        }
        // Continue the game if no team has won yet
        else {
          // Simulate gameplay by making moves for both teams
          team1.playerMove();  // Player move for team1
          team2.aiMove();  // AI move for team2
          System.out.println();
          System.out.println("Current Score: |" + team1.getPlayer().getName() + ": " + team1.getScore() + "| vs |" + team2.getPlayer().getName() + ": " + team2.getScore() + "|");
          System.out.println();
        }
      }
    }
  }