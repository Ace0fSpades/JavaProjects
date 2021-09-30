package task8;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

public class Animation extends JFrame
{
    protected static java.awt.Image image;
    private static JFrame jFrame;
    private static String text;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    Animation()
    {
        super("Test");
        setLayout(new FlowLayout());
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image,0,0, 600, 600, null);
    }

}