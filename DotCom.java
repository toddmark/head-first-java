import java.util.ArrayList;

public class DotCom {

  private ArrayList<String> locationCells;
  // private int numOfHits = 0;

  public void setLocationCells(ArrayList<String> loc) {
    locationCells = loc;
  }

  public String checkYourself(String userInput) {
    String result = "miss";

    int index = locationCells.indexOf(userInput);
    if (index >= 0) {
      locationCells.remove(index);
      if (locationCells.isEmpty()) {
        result = "kill";
      } else {
        result = "hit";
      }
    }
    // for (int cell : locationCells) {
    //   if (guess == cell) {
    //     result = "hit";
    //     numOfHits++;
    //     break;
    //   }
    // }
    // if (numOfHits == locationCells.length) {
    //   result = "kill";
    // }
    System.out.println(result);
    return result;
  }
}
