import org.code.theater.*;
import org.code.media.*;

/*
 *
 */
public class Team {

  private int score;
  private Player player;

  public Team() {
    score = 0;
    player = new Player(); // calls no argument constructor
  }

  public Team(String team, String name, double threePt, double mid, double dunk) {
    score = 0;
    player = new Player(team, name, threePt, mid, dunk);
  }

  public String attemptThreePt() {
    boolean scored = Math.random() <= player.getThreePt(); // decides if player scored

    // add an element that states whether or not player is contested? more interesting but more work
    
    if (scored) {
      score += 3;
      return "Three point shot scored";
    } else {
      return "Three point shot missed"; // could add array of different answers if extra time
    }
  }

  public String attemptMid() {
    boolean scored = Math.random() <= player.getMid(); 
    
    if (scored) {
      score += 2;
      return "Midfield shot scored";
    } else {
      return "Midfield shot missed"; 
    }
  }
  
  public String attemptDunk() {
    boolean scored = Math.random() <= player.getThreePt();
    
    if (scored) {
      score += 2;
      return "Dunk scored";
    } else {
      return "Dunk missed"; 
    }
  }

  public int getScore() {
    return score;
  }

}