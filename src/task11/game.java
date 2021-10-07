package task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class game extends JFrame
{
    private static final long serialVersionUID = 1L;

    private JTextField textField;
    private JButton    button1;
    private JLabel textField2;
    int attempts = 0;



    public game() {
        super("Try to guess");
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());



        textField2 = new JLabel();
        textField2.setText("Try to guess number [0-20]");
        panel.add(textField2);
        textField = new JTextField();
        textField.setColumns(15);
        panel.add(textField);
        button1 = new JButton("Try");
        panel.add(button1);

        ActionListener actionListener = new TestActionListener();

        button1.addActionListener(actionListener);


        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 100));
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String text = textField.getText();
            int guess = Integer.parseInt(text);
            int randomnumber = (int)(Math.random()*21);
            if(e.getActionCommand().equals("Try")){
                if (guess != randomnumber){
                    if(attempts >= 3){
                        textField.setText("You lost");
                        textField.setBackground(Color.red);
                        return;
                    }
                    attempts++;
                    textField.setText("Try again");
                }
                else if (guess == randomnumber){
                    textField.setText("You win");
                    textField.setBackground(Color.green);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                game frame = new game();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
