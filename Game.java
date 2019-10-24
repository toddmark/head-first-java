import java.util.ArrayList;

public class Game {
  public static void main(String[] args) {
    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();

    DotCom theDotCom = new DotCom();
    int randomNum = (int) (Math.random() * 5);

    ArrayList<String> locations = new ArrayList<String>();
    locations.add(String.valueOf(randomNum));
    locations.add(String.valueOf(randomNum + 1));
    locations.add(String.valueOf(randomNum + 2));
    theDotCom.setLocationCells(locations);

    boolean isActive = true;

    while (isActive == true) {
      String guess = helper.getUserInput("enter a number:");
      String result = theDotCom.checkYourself(guess);
      numOfGuesses++;
      if (result.equals("kill")) {
        System.out.println("You took " + numOfGuesses + " guesses");
      }
    }
  }
}
