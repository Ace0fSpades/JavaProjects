package task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bruh extends JFrame
{
    private static final long serialVersionUID = 1L;

    public bruh()
    {
        super("Системное меню");
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setVisible(true);
        add(panel, BorderLayout.CENTER);
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("Цвет");
        JRadioButtonMenuItem cred  = new JRadioButtonMenuItem("Крансый");
        JRadioButtonMenuItem cblue  = new JRadioButtonMenuItem("Синий");
        JRadioButtonMenuItem cgreen = new JRadioButtonMenuItem("Зеленый");
        file.add(cred);
        file.add(cblue);
        file.add(cgreen);
        JTextField text = new JTextField();
        text.setColumns(23);
        text.setText("Test 123 tyty");
        panel.add(text);
        cred.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                text.setForeground(Color.red);
            }
        });
        cblue.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                text.setForeground(Color.blue);
            }
        });
        cgreen.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                text.setForeground(Color.green);
            }
        });


        JMenu viewMenu = new JMenu("Шрифт");

        JRadioButtonMenuItem line  = new JRadioButtonMenuItem("Жирный");
        JRadioButtonMenuItem grid  = new JRadioButtonMenuItem("Курсив");
        JRadioButtonMenuItem navig = new JRadioButtonMenuItem("Обычный");

        viewMenu.add(line);
        viewMenu.add(grid);
        viewMenu.add(navig);

        line.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                text.setFont(text.getFont().deriveFont(Font.BOLD));
            }
        });
        grid.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                text.setFont(text.getFont().deriveFont(Font.ITALIC));
            }
        });
        navig.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                text.setFont(text.getFont().deriveFont(Font.PLAIN));
            }
        });


        menuBar.add(file);
        menuBar.add(viewMenu);


        setJMenuBar(menuBar);
        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        // Подключение украшений для окон
        JFrame.setDefaultLookAndFeelDecorated(true);
        new bruh();
    }
}
