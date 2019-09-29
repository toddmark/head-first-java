import java.awt.*;
import javax.swing.*;

public class Panel1 {
  public static void main(String[] args) {
    JFrame jf = new JFrame();
    Panel jp = new Panel();
    jp.setBackground(Color.YELLOW);
    jf.getContentPane().add(BorderLayout.EAST, jp);
    jf.setSize(600,400);
    jf.setVisible(true);
  }
}
