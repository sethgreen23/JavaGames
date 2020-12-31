package com.dridichaith.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public abstract  class Human extends GlobalPosition{

	public Human(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public abstract void draw(Graphics2D g) ;
	
	
	public Image getPlayer(String player) {
		ImageIcon image = new ImageIcon(getClass().getResource("/images/"+player+".png"));
		return image.getImage();
	}
	
	
	public abstract void update();
}
