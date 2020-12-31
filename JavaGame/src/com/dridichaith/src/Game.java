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
import com.dridichaith.src.controller.Controller;
import com.dridichaith.src.input.KeyInput;
public class Game extends JPanel implements ActionListener{
	Timer timer;
	Player player;
	Controller c;
	public Game() {
		setFocusable(true);
		player = new Player(100,100);
		addKeyListener(new KeyInput(player));
		c = new Controller();
		c.add(new Enemy(100,60));
		c.add(new Enemy(300,140));
		c.add(new Enemy(400,200));
		c.add(new Enemy(0,0));
		c.add(new Enemy(150,240));
		c.add(new Enemy(200,290));
		c.add(new Enemy(350,350));
		c.add(new Enemy(500,400));
		timer = new Timer(10,this);
		timer.start();
		
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		//set background of the panel
		g2d.drawImage(getBackgroundImage(), 0, 0, null);
		//draw the player
		player.draw(g2d);
		c.draw(g2d);
	}
	
	public Image getBackgroundImage() {
		ImageIcon image = new ImageIcon(getClass().getResource("/images/background1.png"));
		return image.getImage();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		player.update();
		c.update(player);
		repaint();
	}

}
