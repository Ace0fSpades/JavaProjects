package task8;

import javax.swing.*;

public class Gif extends Animation
{
    public static void main(String[] args) {
        String path = "C:\\Users\\sylva\\IdeaProjects\\JavaProjects\\src\\task8\\icon\\";
        new Animation();
        for (int fr = 0; fr < 96; fr++ ){

                framlist.add(new ImageIcon(path + fr + ".gif").getImage());


        }

        Animation animImg = new Animation();
        while (true) {
            for (int i = 0; i < 96; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try
                {
                    Thread.sleep(30);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}