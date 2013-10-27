package tilelandscape;

import java.awt.Canvas;
import javax.swing.*;
 
public class WorldGen extends JPanel {

    public static void main(String[] args) {
        JFrame j = new JFrame();
        JPanel p = new JPanel();
        
        GlobalNums num = new GlobalNums();
        Navigation n = new Navigation();
        GameGraphics graphics = new GameGraphics();       
        p.setSize(num.tileCol * 5, num.tileRow * 5 + 15);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        graphics.addKeyListener(n);     
        j.setSize(num.tileCol * 5 + 100, num.tileRow * 5 + 15);
        j.setLocationRelativeTo(null);
        //j.setResizable(false);
        j.add(graphics);
        graphics.t.start();
        j.show(true);
    }
}
