import org.code.theater.*;
import org.code.media.*;

/*
 *
 */
public class Player {
  private String team;
  private String name;
  private double threePt;
  private double mid;
  private double dunk;

  
  public Player() {
    team = "Team1";
    name = "Player1";
    threePt = 0.3; // arbitrary values added if no values inputted
    mid = 0.3;
    dunk = 0.3;
  }
  
  public Player(String team, String name, double threePt, double mid, double dunk) {
    this.team = team;
    this.name = name;
    this.threePt = threePt;
    this.mid = mid;
    this.dunk = dunk;
  }

  public String getTeam() {
    return team;
  }

  public String getName() {
    return name;
  }
  
  public double getThreePt() {
    return threePt;
  }

  public double getMid() {
    return mid;
  }

  public double getDunk() {
    return dunk;
  }

  
  // no mutator method since percentages wont be chan
  // add toString? maybe?

  
}