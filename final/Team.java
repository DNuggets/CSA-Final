import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;

/**
 * The Team class represents a basketball team with a player and a score.
 * It provides methods for player and AI moves and attempts different types of shots.
 */
public class Team {

  private int score;  // Score of the team
  private Player player;  // Player object representing the player in the team

  /**
   * Default constructor initializing the team with a default player and score of 0.
   */
  public Team() {
    score = 0;
    player = new Player(); // calls no argument constructor of Player
  }

  /**
   * Constructor initializing the team with specified player attributes and score of 0.
   *
   * @param team The team name.
   * @param name The player's name.
   * @param threePt The player's three-pointer success rate.
   * @param mid The player's mid-range shot success rate.
   * @param dunk The player's dunk success rate.
   */
  public Team(String team, String name, double threePt, double mid, double dunk) {
    score = 0;
    player = new Player(team, name, threePt, mid, dunk);
  }

  /**
   * Simulates an AI move by randomly choosing between a three-pointer, mid-range shot, or dunk.
   */
  public void aiMove() {
    int move = (int) (Math.random() * 3 + 1); // Randomly selects a move between 1 and 3

    if (move == 1) {
      System.out.println();
      System.out.println("AI" + attemptDunk());
      System.out.println();
    } else if (move == 2) {
      System.out.println();
      System.out.println("AI" + attemptMid());
      System.out.println();
    } else {
      System.out.println();
      System.out.println("AI" + attemptThreePt());
      System.out.println();
    }
  }

  /**
   * Allows the player to choose a move: three-pointer, mid-range shot, or dunk.
   * Uses Scanner to read input from the user.
   */
  public void playerMove() {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Choose a move: \n1: 3-Pointer \n2: Mid-Range Shot \n3: Slam Dunk");
    int move = myObj.nextInt();  // Reads player's move choice
    
    if (move == 1) {
      System.out.println();
      System.out.println("You" + attemptThreePt());
      System.out.println();
    } else if (move == 2) {
      System.out.println();
      System.out.println("You" + attemptMid());
      System.out.println();
    } else if (move == 3) {
      System.out.println();
      System.out.println("You" + attemptDunk());
      System.out.println();
    } else {
      System.out.println("Please select a number 1 to 3"); // Informs user of invalid choice
    }
   
    myObj.close(); // Closes the Scanner to avoid resource leaks
  }

  /**
   * Attempts a three-pointer shot.
   *
   * @return A string describing the result of the attempt.
   */
  public String attemptThreePt() {
    boolean scored = Math.random() <= player.getThreePt(); // Determines if the shot is successful based on player's three-pointer success rate

    if (scored) {
      score += 3; // Adds 3 points to the score if successful
      return " attempted a three pointer ... " + "BANGGGGGG! " + player.getName() +" hits the three-pointer dagger!";
    } else {
      return " attempted a three pointer ... " + "AIRBALL!"; // Could add array of different answers if extra time
    }
  }

  /**
   * Attempts a mid-range shot.
   *
   * @return A string describing the result of the attempt.
   */
  public String attemptMid() {
    boolean scored = Math.random() <= player.getMid(); // Determines if the shot is successful based on player's mid-range shot success rate
    
    if (scored) {
      score += 2; // Adds 2 points to the score if successful
      return " attempted a mid-range shot ... " +"Nice Stepback by " + player.getName();
    } else {
      return " attempted a mid-range shot ... " +"In-and-out! Tough Luck!"; 
    }
  }

  /**
   * Attempts a slam dunk.
   *
   * @return A string describing the result of the attempt.
   */
  public String attemptDunk() {
    boolean scored = Math.random() <= player.getDunk(); // Determines if the shot is successful based on player's dunk success rate
    
    if (scored) {
      score += 2; // Adds 2 points to the score if successful
      return " attempted a slam dunk ... " +"Put that on a poster!";
    } else {
      return " attempted a slam dunk ... " +"Bro missed the dunk??? Embarrassing."; 
    }
  }

  /**
   * Gets the name of the player in the team.
   *
   * @return The player's name.
   */
  public String getName() {
    return player.getName();
  }

  /**
   * Gets the current score of the team.
   *
   * @return The team's score.
   */
  public int getScore() {
    return score;
  }

  /**
   * Gets the player object of the team.
   *
   * @return The player object.
   */
  public Player getPlayer() {
    return player;
  }
}