import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a basketball player with abilities in three-point shooting, mid-range shooting, and dunking.
 */
public class Player {
  private String team;
  private String name;
  private double threePt;
  private double mid;
  private double dunk;

  /**
   * Default constructor initializing with default values.
   * Preconditions: None
   * Postconditions: A player with predefined stats is created.
   */
  public Player() {
    team = "Team #1";  // Default team name.
    name = "Player #1";  // Default player name.
    threePt = 0.3;  // Default three-point shooting ability.
    mid = 0.3;  // Default mid-range shooting ability.
    dunk = 0.3;  // Default dunking ability.
  }
  
  /**
   * Constructor to create a player with specified abilities.
   * @param team The team name of the player.
   * @param name The name of the player.
   * @param threePt The three-point shooting percentage of the player.
   * @param mid The mid-range shooting percentage of the player.
   * @param dunk The dunking ability percentage of the player.
   * Preconditions: threePt, mid, and dunk are between 0 and 1.
   * Postconditions: A player with specified stats is created.
   */
  public Player(String team, String name, double threePt, double mid, double dunk) {
    this.team = team;
    this.name = name;
    this.threePt = threePt;
    this.mid = mid;
    this.dunk = dunk;
  }

  /**
   * Returns the team of the player.
   * Preconditions: None
   * Postconditions: Returns the team name.
   * @return String representing the team name.
   */
  public String getTeam() {
    return team;
  }

  /**
   * Returns the name of the player.
   * Preconditions: None
   * Postconditions: Returns the player's name.
   * @return String representing the player's name.
   */
  public String getName() {
    return name;
  }
  
  /**
   * Returns the player's three-point shooting ability.
   * Preconditions: None
   * Postconditions: Returns the three-point shooting percentage.
   * @return double representing the three-point shooting percentage.
   */
  public double getThreePt() {
    return threePt;
  }

  /**
   * Returns the player's mid-range shooting ability.
   * Preconditions: None
   * Postconditions: Returns the mid-range shooting percentage.
   * @return double representing the mid-range shooting percentage.
   */
  public double getMid() {
    return mid;
  }

  /**
   * Returns the player's dunking ability.
   * Preconditions: None
   * Postconditions: Returns the dunking ability percentage.
   * @return double representing the dunking ability percentage.
   */
  public double getDunk() {
    return dunk;
  }
}
