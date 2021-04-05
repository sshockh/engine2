package ru.sshock.engine2;

import java.awt.event.*;

public class Input implements KeyListener, MouseListener, MouseMotionListener, MouseWheelListener {

    private final GameContainer gc;
    private final int NUM_KEYS = 256;
    private final boolean[] keys = new boolean[NUM_KEYS];
    private final boolean[] keysLast = new boolean[NUM_KEYS];

    private final int NUM_BUTTONS = 5;
    private final boolean[] buttons = new boolean[NUM_BUTTONS];
    private final boolean[] buttonsLat = new boolean[NUM_BUTTONS];

    private int mouseX, mouseY;
    private int scroll;

    public Input(GameContainer gc) {
        this.gc = gc;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {

    }
}
