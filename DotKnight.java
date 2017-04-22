/**
 * @(#)DotKnight.java
 *
 *
 * @Shahir Chowdhury
 * @version 1.00 2017/4/22
 */

/* This program creates the DotKnight's game loop and is used to run the game */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DotKnight extends JFrame implements ActionListener{
	Timer myTimer;   
	DotPanel game;

	private int windoww = 750; //window width
	private int windowh = 750; //window height

	public DotKnight() {
		super("Dot Knight");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(windoww,windowh);

		myTimer = new Timer(10, this);	 // trigger every 10 ms
		this.setTitle(title());

		game = new DotPanel(this);
		add(game);

		setResizable(false);
		setVisible(true);
    }
    public void start(){
		myTimer.start();
	}
	public void actionPerformed(ActionEvent evt){
		//game.input(); //takes in all player input
		//game.update(); //move all objects in the game
		//game.repaint(); //updates the game
	}

    public static void main(String[] arguments) {
		DotKnight frame = new DotKnight();		
    }
    public void update(){ //updates the rest of the game if in the game screen
    }

    /* Changes the title of the window to something creative */
    public String title(){ 
    	int chance = (int)(Math.random()*100);

    	if (chance < 25){
    		return "Dot Knight: A Tale From Really Far Away";
    	}
    	else if (chance > 25 && chance < 50){
    		return "Dot Knight: Hero of the Circles";
    	}
    	else if (chance > 50 && chance < 75){
    		return "Dot Knight (Amazing Graphics)";
    	}
    	else if (chance > 75 && chance < 99){
    		return "Dot Knight";
    	}
    	else{ //Chance represents the odds of Hassan waking up
    		return "Dot Knight: Hassan Awakens";
    	}
    }
}