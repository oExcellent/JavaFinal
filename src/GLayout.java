import java.awt.GridLayout;
import javax.swing.JFrame;

public class GLayout {

  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("GridLayout Test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new GridLayout(5, 10));
    frame.setVisible(true);
  }
}

