import java.io.*;
public class GameSaveTest {
  private static ObjectOutputStream os;
  private static ObjectInputStream is;

  public static void main(String[] args) {
    GameCharacter one = new GameCharacter(50, "toddmark", new String[] {"bow", "sword"});
    GameCharacter two = new GameCharacter(200, "robinson", new String[] {"bare hands", "big ax"});
    GameCharacter three = new GameCharacter(120, "lily", new String[] {"spells", "invisibility"});

    try {
      os = new ObjectOutputStream(new FileOutputStream("gamer.ser"));
      os.writeObject(one);
      os.writeObject(two);
      os.writeObject(three);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    one = null;
    two = null;
    three = null;

    try {
      is = new ObjectInputStream(new FileInputStream("gamer.ser"));
      GameCharacter oneRestore = (GameCharacter) is.readObject();
      GameCharacter twoRestore = (GameCharacter) is.readObject();
      GameCharacter threeRestore = (GameCharacter) is.readObject();

      System.out.println("one= " + oneRestore.getName());
      System.out.println("two= " + twoRestore.getName());
      System.out.println("three= " + threeRestore.getName());
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    try {
      FileWriter writer = new FileWriter("Foo.txt");
      writer.write("hello foo!");
      writer.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
