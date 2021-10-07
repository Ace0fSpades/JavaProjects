package task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AboutDialog extends JDialog{

    public AboutDialog(JFrame owner){
        super(owner,"Test",true);
        JPanel panel = new JPanel();

        JButton ok = new JButton("ok");
        ok.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                setVisible(false);
            }
        });


        panel.add(ok);
        add(panel,BorderLayout.SOUTH);
        setSize(260,160);
    }
    public void setlabel(String text){
        JLabel label = new JLabel(text);
        add(label,BorderLayout.CENTER);
    }
}

public class take extends JFrame {

    private JPanel panel;
    private JPanel cNorth;
    private JPanel cCenter;
    private JPanel cWest;
    private JPanel cSouth;
    private JPanel cEast;
    private AboutDialog dialog;

    public take(){
        super("Border");
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        cNorth = new JPanel();
        cSouth = new JPanel();
        cWest = new JPanel();
        cEast = new JPanel();
        cCenter = new JPanel();

        cNorth.setBackground(Color.blue);
        cSouth.setBackground(Color.red);
        cWest.setBackground(Color.green);
        cEast.setBackground(Color.gray);
        cCenter.setBackground(Color.yellow);

        panel.setLayout(new BorderLayout());
        panel.add(cCenter, BorderLayout.CENTER);
        panel.add(cNorth, BorderLayout.NORTH);
        panel.add(cSouth, BorderLayout.SOUTH);
        panel.add(cWest, BorderLayout.WEST);
        panel.add(cEast, BorderLayout.EAST);



        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (cCenter == (JPanel) e.getSource()) {
                    dialog = new AboutDialog(take.this);
                    dialog.setlabel("Center");
                    dialog.setVisible(true);
                }
                else if (cSouth == (JPanel) e.getSource()){
                    dialog = new AboutDialog(take.this);
                    dialog.setlabel("South");
                    dialog.setVisible(true);
                }
                else if (cWest == (JPanel) e.getSource()){
                    dialog = new AboutDialog(take.this);
                    dialog.setlabel("West");
                    dialog.setVisible(true);
                }
                else if (cEast == (JPanel) e.getSource()){
                    dialog = new AboutDialog(take.this);
                    dialog.setlabel("East");
                    dialog.setVisible(true);
                }
                else if (cNorth == (JPanel) e.getSource()){
                    dialog = new AboutDialog(take.this);
                    dialog.setlabel("North");
                    dialog.setVisible(true);
                }

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };

        cCenter.addMouseListener(mouseListener);
        cNorth.addMouseListener(mouseListener);
        cSouth.addMouseListener(mouseListener);
        cWest.addMouseListener(mouseListener);
        cEast.addMouseListener(mouseListener);

        getContentPane().add(panel);
        setPreferredSize(new Dimension(500, 500));
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                take frame = new take();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

}
