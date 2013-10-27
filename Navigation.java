
package tilelandscape;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Navigation implements KeyListener {
    
    GlobalNums g = new GlobalNums();
    GameGraphics graphics = new GameGraphics();
    
    static int xOff = 10;
    static int yOff = 10;
    
    public Navigation(){

    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_W:
                g.yOff+= g.tileSq;
                break;
            case KeyEvent.VK_S:
                g.yOff-= g.tileSq;
                break;
            case KeyEvent.VK_A:
                g.xOff+= g.tileSq;
                break;
            case KeyEvent.VK_D:
                g.xOff-= g.tileSq;
                break;
            case KeyEvent.VK_UP:
                if(g.zoom < 3)
                g.zoom++;
                break;
                case KeyEvent.VK_DOWN:
                if(g.zoom > 1)
                g.zoom--;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        
    }
    
}
