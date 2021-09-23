package task8;

import javax.swing.*;
import java.awt.*;

// класс рисования фигур
class Shape extends JComponent{
    private Color color;
    private int x;
    private int y;
    // параметры: цвет и позиция фигуры
    Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    public void paintComponent(Graphics g) {
        // прорисовка фигуры
        int ran_type = (int)(Math.random()*4);
        int ran_param = (int)(Math.random()*70+50);
        int ran_height = (int)(Math.random()*70+50);
        g.setColor(new Color((int)(Math.random() * 0x1000000)));
        switch (ran_type) {
            case 0: g.fillOval(x, y,ran_param, ran_height); break;
            case 1: g.fillRect(x ,y, ran_param, ran_height); break;
            case 2: g.fillRect(x,y,ran_param,ran_param);break;
            case 3: g.fillOval(x,y,ran_param,ran_param);break;
        }


    }
}
public class JLayeredPaneTest extends JFrame{

    public JLayeredPaneTest()
    {
        // создание окна
        super("20 random Shapes");
        // выход при закрытии окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // определение многослойной панели
        JLayeredPane lp = getLayeredPane();
        // создание 20 фигур
        Shape shapes[] = new Shape[20];
        for(int i = 0;i<20;i++){
            shapes[i] = new Shape(new Color((int)(Math.random() * 0x1000000)),0,0);
        }
        // определение местоположения фигур в окне
        for(int i = 0;i<20;i++){
            int tmp_x = (int)(Math.random()*450+10);
            int tmp_y = (int)(Math.random()*450+10);
            int tmp_w = (int)(Math.random()*100+200);
            int tmp_h = (int)(Math.random()*100+200);

            shapes[i].setBounds(tmp_x, tmp_y, tmp_w, tmp_h);
        }
        // добавление фигур в различные слои
        for(int i = 0;i<20;i++){
            int ran_type = (int)(Math.random()*2);
            switch(ran_type) {
                case 0: lp.add(shapes[i], JLayeredPane.PALETTE_LAYER);break;
                case 1: lp.add(shapes[i], JLayeredPane.POPUP_LAYER);break;
            }
        }
        // определение размера и открытие окна
        setSize(1000, 1000);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new JLayeredPaneTest();
    }

}