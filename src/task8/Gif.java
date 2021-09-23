package task8;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gif extends JFrame {

    private JLabel pictureLabel;
    private Container controls;

    public Gif() {
        super("window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        this.setSize(500, 500);
        this.startWindow();
    }

    private void startWindow() {
        controls = new Container();
        controls = getContentPane();
        controls.setLayout(new FlowLayout());
        pictureLabel = new JLabel(new ImageIcon("C:\\Users\\sylva\\IdeaProjects\\JavaProjects\\src\\task8\\icon.gif"));
        controls.add(pictureLabel);

    }

    public static void main(String[] args) {
        Gif w = new Gif();
        w.setVisible(true);
    }
}
