package com.dridichaith.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public abstract  class Human extends GlobalPosition{
	//the rectangle will be usefull for us when we want to detect
	//collision between a player and enemy
	public Rectangle rect;
	public Human(int x, int y) {
		super(x, y);
		//we initialize the rectangle as the dimension of
		//our player or enemy 32 px by 32px
		rect = makeRectangle();
		// TODO Auto-generated constructor stub
	}
	//draw the object
	public abstract void draw(Graphics2D g) ;
	
	//get the player or enemy image
	public Image getPlayer(String player) {
		ImageIcon image = new ImageIcon(getClass().getResource("/images/"+player+".png"));
		return image.getImage();
	}
	
	//it return a rectangle of 32/32 px
	public Rectangle makeRectangle() {
		return new Rectangle(getX(),getY(),32,32);
	}
	
	//abstract method to update the player position
	public abstract void update();
}
