/**
 * @(#)DotPanel.java
 *
 *
 * @Shahir Chowdhury
 * @version 1.00 2017/4/22
 */

/* This program creates a DotPanel object that oversees all objects in the game */

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DotPanel extends JPanel implements KeyListener{
	private int windoww = 750; //window width
	private int windowh = 750; //window height

	private boolean []keys;

	private DotKnight mainFrame;

	public DotPanel(DotKnight m){
		keys = new boolean[KeyEvent.KEY_LAST+1];
		mainFrame = m;

		setSize(windoww,windowh);
        addKeyListener(this);
	}

	public void addNotify() {
        super.addNotify();
        requestFocus();
        mainFrame.start();
    }

    /*gets all user input and updates the player*/
    public void input(){
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }


}