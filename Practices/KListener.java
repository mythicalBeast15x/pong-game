package Practices;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KListener implements KeyListener {

    private boolean keyPressed[] = new boolean[128];

    @Override
    public void keyTyped(KeyEvent keyCode) {}

    @Override
    public void keyPressed(KeyEvent keyCode) {
        keyPressed[keyCode.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent keyCode) {
        keyPressed[keyCode.getKeyCode()] = false;
    }
    public boolean isKeyPressed(int keyCode){
        return keyPressed[keyCode];
    }
}
