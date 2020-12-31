package com.dridichaith.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public abstract  class Human extends GlobalPosition{
	public Rectangle rect;
	public Human(int x, int y) {
		super(x, y);
		rect = makeRectangle();
		// TODO Auto-generated constructor stub
	}
	public abstract void draw(Graphics2D g) ;
	
	
	public Image getPlayer(String player) {
		ImageIcon image = new ImageIcon(getClass().getResource("/images/"+player+".png"));
		return image.getImage();
	}
	
	public Rectangle makeRectangle() {
		return new Rectangle(getX(),getY(),32,32);
	}
	
	public abstract void update();
}
