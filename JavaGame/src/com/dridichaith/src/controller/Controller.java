package com.dridichaith.src.controller;

import java.awt.Graphics2D;
import java.util.LinkedList;

import com.dridichaith.src.objects.Enemy;
import com.dridichaith.src.objects.Player;

public class Controller {
	private LinkedList<Enemy> enemies;
	
	public Controller() {
		enemies= new LinkedList<Enemy>();
	}
	
	public void add(Enemy e) {
		enemies.add(e);
	}
	
	public void draw(Graphics2D g2d) {
		for(Enemy e : enemies) {
			e.draw(g2d);
		}
	}
	
	public void  update(Player p) {
		Enemy temp=null;
		for(Enemy e : enemies) {
			if(p.rect.intersects(e.rect)) {
				temp =e;
			}
			e.update();
		}
		if(temp!=null) {
			enemies.remove(temp);
		}
	}
	
	public void removeEnemy(Enemy e) {
		enemies.remove(e);
	}
	
	public LinkedList<Enemy> getEnemyCollection(){
		return enemies;
	}
}
