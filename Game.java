public class Game {
  public static void main(String[] args) {
    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();

    SimpleDotCom theDotCom = new SimpleDotCom();
    int randomNum = (int)(Math.random() * 5);

    int[] locations = {randomNum, randomNum + 1, randomNum + 2};
    theDotCom.setLocationCells(locations);

    boolean isActive = true;

    while(isActive == true) {
      String guess = helper.getUserInput("enter a number:");
      String result = theDotCom.checkYourself(guess);
      numOfGuesses++;
      if (result.equals("kill")) {
        System.out.println("You took " + numOfGuesses + " guesses");
      }
    }
  }
}
