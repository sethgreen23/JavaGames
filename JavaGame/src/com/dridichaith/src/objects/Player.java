package com.dridichaith.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import com.dridichaith.src.MainClass;

public class Player extends Human{
	//the player have a standar speed of 5
	public int speed=5;
	public Player(int x, int y) {
		super(x, y);
	}

	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		//every 10 millisecond we change the cordinate 
		//of the rectangle with the cordinate of the player
		rect.x = getX();
		rect.y=getY();
		//draw the image of the player
		g.drawImage(getPlayer("player"), getX(),getY(),null);
		//draw the rectangle on a new position
		g.draw(rect);
		
	}
	
	//get the player image from the resource
	public Image getPlayer(String player) {
		ImageIcon image = new ImageIcon(getClass().getResource("/images/"+player+".png"));
		return image.getImage();
	}
	public void update() {
		// TODO Auto-generated method stub
		wallCollision();
		
	}
	
	//this method take care of detection 
	//of the collision of the player and the wall
	private void wallCollision() {
		// TODO Auto-generated method stub
		if(getX()<0) {
			setX(0);
		}
		if(getY()<0) {
			setY(0);
		}
		if(getY()>(MainClass.HEIGTH-69)) {
			setY(MainClass.HEIGTH-69);
		}
		if(getX()>(MainClass.WIDTH-45)) {
			setX(MainClass.WIDTH-45);
		}
	}
	//this function will make sure of changing
	//the position of the player when we press on the direction
	//keys
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_UP) {
			setY(5,false);
		}else if(key == KeyEvent.VK_DOWN) {
			setY(5,true);
		}else if(key==KeyEvent.VK_LEFT) {
			setX(5,false);
		}else if(key==KeyEvent.VK_RIGHT) {
			setX(5,true);
		}
	}
	//this will take care to not change the position 
	//of the player when we release the keys
	public void keyRelease(KeyEvent e) {
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_UP) {
			setY(0,false);
		}else if(key == KeyEvent.VK_DOWN) {
			setY(0,true);
		}else if(key==KeyEvent.VK_LEFT) {
			setX(0,false);
		}else if(key==KeyEvent.VK_RIGHT) {
			setX(0,true);
		}
	}

}
