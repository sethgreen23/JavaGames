package com.dridichaith.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import com.dridichaith.src.MainClass;

public class Enemy extends Human {
	//the enemy speed is 5
	int speed = 5;
	public Enemy(int x, int y) {
		super(x, y);
	}
	
	//make sure to draw rectangle, enemy
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		rect.x = getX();
		rect.y = getY();
		g.drawImage(getPlayer("enemy1"), getX(),getY(),null);
		g.draw(rect);
	}
	
	//get the player image
	public Image getPlayer(String player) {
		ImageIcon image = new ImageIcon(getClass().getResource("/images/"+player+".png"));
		return image.getImage();
	}
	
	
	public void update() {
		//we update the x position of the enemy
		setX(speed,true);
		//if the enemy hit the wall he bounce back
		if(getX()<0 || getX()>(MainClass.WIDTH-45)) {
			speed=-speed;
		}
	}
	
	
}
