package tilelandscape;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//You can fix this here by:








public class GameGraphics extends JPanel implements ActionListener {

    Timer t = new Timer(50, this);
    LandscapeGen land = new LandscapeGen();
    GlobalNums num = new GlobalNums();
    Color water = new Color(0, 75, 255);
    Color grass = new Color(50, 255, 50);
    Color wood = new Color(120, 69, 19);
    Color stone = new Color(140, 140, 140);

    public GameGraphics() {
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        land.fixTiles();
        if (land.go) {
            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.black);
        for (int x = 0; x < num.tileRow; x++) {
            for (int y = 0; y < num.tileCol; y++) {

                if (land.xTile[x][y].isDiscovered) {
                   g.setColor(land.xTile[x][y].locColor);
                } else {
                   g.setColor(Color.black);
                }
                g.fillRect((land.xTile[x][y].xPos + num.xOff) * num.zoom, (land.xTile[x][y].yPos + num.yOff) * num.zoom, num.tileSq * num.zoom, num.tileSq * num.zoom);

            }

        }
        g.setColor(Color.red);
        g.fillRect(num.tileSq * num.zoom * num.tileSq, num.tileSq * num.zoom * num.tileSq, num.tileSq * num.zoom, num.tileSq * num.zoom);
        g.setColor(Color.white);
        g.fillRect(num.tileCol * 5 - 50, 0, 150, num.tileRow * 5 + 15);
        g.setColor(Color.black);
        g.fillRect(num.tileCol * 5 - 50, 0, 10, num.tileRow * 5 + 15);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (land.go) {
            
            try{
            land.xTile[Math.abs(-num.yOff/num.tileSq + 10)][Math.abs(-num.xOff/num.tileSq + 10)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 11)][Math.abs(-num.xOff/num.tileSq + 11)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 11)][Math.abs(-num.xOff/num.tileSq + 12)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 12)][Math.abs(-num.xOff/num.tileSq + 12)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 12)][Math.abs(-num.xOff/num.tileSq + 11)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 9)][Math.abs(-num.xOff/num.tileSq + 9)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 9)][Math.abs(-num.xOff/num.tileSq + 8)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 8)][Math.abs(-num.xOff/num.tileSq + 8)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 8)][Math.abs(-num.xOff/num.tileSq + 9)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 11)][Math.abs(-num.xOff/num.tileSq + 9)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 11)][Math.abs(-num.xOff/num.tileSq + 8)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 12)][Math.abs(-num.xOff/num.tileSq + 8)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 12)][Math.abs(-num.xOff/num.tileSq + 9)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 9)][Math.abs(-num.xOff/num.tileSq + 11)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 9)][Math.abs(-num.xOff/num.tileSq + 12)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 8)][Math.abs(-num.xOff/num.tileSq + 12)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 8)][Math.abs(-num.xOff/num.tileSq + 11)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 10)][Math.abs(-num.xOff/num.tileSq + 9)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 10)][Math.abs(-num.xOff/num.tileSq + 8)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 9)][Math.abs(-num.xOff/num.tileSq + 10)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 8)][Math.abs(-num.xOff/num.tileSq + 10)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 11)][Math.abs(-num.xOff/num.tileSq + 10)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 12)][Math.abs(-num.xOff/num.tileSq + 10)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 10)][Math.abs(-num.xOff/num.tileSq + 11)].isDiscovered = true;
            land.xTile[Math.abs(-num.yOff/num.tileSq + 10)][Math.abs(-num.xOff/num.tileSq + 12)].isDiscovered = true;
            }
            catch(Throwable t){
                
            }
            
            repaint();
        }
    }
}
