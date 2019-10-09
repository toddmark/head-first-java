import java.awt.*;
import javax.swing.*;

public class Panel1 {
  public static void main(String[] args) {
    JFrame jf = new JFrame();
    JPanel jp = new JPanel();
    jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
    Button btn = new Button("one");
    Button btn1 = new Button("two");
    jp.add(btn);
    jp.add(btn1);
    jp.setBackground(Color.gray);
    jf.getContentPane().add(BorderLayout.EAST, jp);
    jf.setSize(600,400);
    jf.setVisible(true);
  }
}
