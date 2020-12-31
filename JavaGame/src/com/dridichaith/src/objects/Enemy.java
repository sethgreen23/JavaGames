package com.dridichaith.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.dridichaith.src.MainClass;

public class Enemy extends Human {
	int speed = 5;
	public Enemy(int x, int y) {
		super(x, y);
	}
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		g.drawImage(getPlayer("enemy"), getX(),getY(),null);
		
	}
	
	public Image getPlayer(String player) {
		ImageIcon image = new ImageIcon(getClass().getResource("/images/"+player+".png"));
		return image.getImage();
	}
	public void update() {
		setX(speed,true);
		if(getX()<0 || getX()>(MainClass.WIDTH-45)) {
			speed=-speed;
		}
	}
	
	
}
