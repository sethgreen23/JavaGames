package com.dridichaith.src;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.dridichaith.src.objects.Enemy;
import com.dridichaith.src.objects.Player;
import com.dridichaith.src.controller.EnemyController;
import com.dridichaith.src.input.KeyInput;
public class Game extends JPanel implements ActionListener{
	//diffine the fields of our game class
	Timer timer;
	Player player;
	EnemyController c;
	public Game() {
		//make the game panel focussable from the beggining
		setFocusable(true);
		//set the player in the screen
		player = new Player(100,100);
		//add a key listener on the player to 
		//controle its movement with direction arrow keys
		addKeyListener(new KeyInput(player));
		//create enemy controller that will controle bunch of enemies
		c = new EnemyController();
		c.add(new Enemy(100,60));
		c.add(new Enemy(300,140));
		c.add(new Enemy(400,200));
		c.add(new Enemy(0,0));
		c.add(new Enemy(150,240));
		c.add(new Enemy(200,290));
		c.add(new Enemy(350,350));
		c.add(new Enemy(500,400));
		//the timer is an infinite loop for our game
		//Game jpanel use it as trigger for drawing its frames 
		timer = new Timer(10,this);
		timer.start();
		
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		//set background of the panel
		g2d.drawImage(getBackgroundImage(), 0, 0, null);
		//draw the player
		player.draw(g2d);
		//draw the enemies
		c.draw(g2d);
	}
	//set the image of the background
	public Image getBackgroundImage() {
		ImageIcon image = new ImageIcon(getClass().getResource("/images/background1.png"));
		return image.getImage();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//this function will make sure to repaint
		// and update the player and enemies 
		//position,check the collision and make sure
		//the object stay in the boundories of the frame
		//every 10 milliseconds
		player.update();
		c.update(player);
		repaint();
	}

}
