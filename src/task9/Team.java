package task9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Team extends JFrame
{

    int madrid = 0;
    int milan = 0;
    private JLabel labelRes = new JLabel("Result: "+madrid+" X "+milan);
    private JLabel labelLast = new JLabel("Last Scorer: N/A");
    private JLabel labelWin = new JLabel("Winner: Draw");


    public Team()
    {
        super("Team");
        this.setBounds(200,200,1000,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,4,2,2));
        GridBagConstraints constraints = new GridBagConstraints();

        container.add(labelLast);
        container.add(labelWin);
        container.add(labelRes);

        JButton buttonMad = new JButton("Madrid");
        container.add(buttonMad, constraints);

        JButton buttonMil  = new JButton("Milan");
        container.add(buttonMil, constraints);

        buttonMad.addActionListener(new ButtonMadListener());
        buttonMil.addActionListener(new ButtonMilListener());
    }

    public class ButtonMadListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            madrid += 1;
            labelRes.setText("Result: "+madrid+" X "+milan);
            labelLast.setText("Last scorer: Madrid");
            if (madrid > milan)
                labelWin.setText("Winner: Madrid");
            else if (milan > madrid)
                labelWin.setText("Winner: Milan");
            else
                labelWin.setText("Winner: Draw");
        }
    }

    public class ButtonMilListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            milan += 1;
            labelRes.setText("Result: "+madrid+" X "+milan);
            labelLast.setText("Last scorer: Milan");
            if (madrid > milan)
                labelWin.setText("Winner: Madrid");
            else if (milan > madrid)
                labelWin.setText("Winner: Milan");
            else
                labelWin.setText("Winner: Draw");
        }
    }
    public static void main(String[] args)
    {
        Team app = new Team();
        app.setVisible(true);
    }
}