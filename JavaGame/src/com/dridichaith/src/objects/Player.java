package com.dridichaith.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import com.dridichaith.src.MainClass;

public class Player extends Human{
	public int speed=5;
	public Player(int x, int y) {
		super(x, y);
	}

	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		g.drawImage(getPlayer("player"), getX(),getY(),null);
		
	}
	
	public Image getPlayer(String player) {
		ImageIcon image = new ImageIcon(getClass().getResource("/images/"+player+".png"));
		return image.getImage();
	}
	public void update() {
		// TODO Auto-generated method stub
		wallCollision();
	}
	
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
