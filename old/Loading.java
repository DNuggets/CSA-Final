package old;
import org.code.theater.*;
import org.code.media.*;

public class Loading {

  private String[][] defaults;

  public Loading() {
    defaults = getImagesFromFile("team.txt", "names.txt", "threePT.txt", "middy.txt", "jamtime.txt")

  }
  
  //Converts files to a 2d array
  public String[][] getImagesFromFile(String file1Name, String file2Name, String file3Name, String file4Name, String file5Name) {
    String[][] tempImages = new String[file1Name.length()][5];
    //Team names
    tempImages[0] = FileReader.toStringArray(file1Name);
    //Player names
    tempImages[1] = FileReader.toStringArray(file2Name);
    //3pt stats
    tempImages[2] = FileReader.toDoubleArray(file3Name);
    //3pt stats
    tempImages[3] = FileReader.toStringArray(file4Name);
    //3pt stats
    tempImages[4] = FileReader.toStringArray(file5Name);
    return tempImages;
  }

  



  
}
