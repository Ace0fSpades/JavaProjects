package task8;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image_gen extends JFrame {

    private JLabel pictureLabel;
    private Container controls;

    public Image_gen() {
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
        pictureLabel = new JLabel(new ImageIcon("C:\\Users\\sylva\\IdeaProjects\\JavaProjects\\src\\task8\\twitch.png"));
        controls.add(pictureLabel);
    }

    public static void main(String[] args) {
        Image_gen w = new Image_gen();
        w.setVisible(true);
    }
}
