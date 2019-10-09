import java.io.Serializable;

public class GameCharacter implements Serializable {
  private int level = 0;
  private String name = "";
  private String[] weapons = {};
  GameCharacter(int level, String name, String[] weapons) {
    this.setLevel(level);
    this.setName(name);
    this.setWeapons(weapons);
  }

  public String[] getWeapons() {
    return weapons;
  }

  public void setWeapons(String[] weapons) {
    this.weapons = weapons;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
