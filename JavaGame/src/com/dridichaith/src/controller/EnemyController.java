package com.dridichaith.src.controller;

import java.awt.Graphics2D;
import java.util.LinkedList;

import com.dridichaith.src.objects.Enemy;
import com.dridichaith.src.objects.Player;

public class EnemyController {
	//this data structure will keep track of the enemies we create
	private LinkedList<Enemy> enemies;
	
	public EnemyController() {
		//we instantiate the LinkedList
		enemies= new LinkedList<Enemy>();
	}
	
	//add enemy to our linkedlist
	public void add(Enemy e) {
		enemies.add(e);
	}
	
	//we draw all our enemies
	public void draw(Graphics2D g2d) {
		for(Enemy e : enemies) {
			e.draw(g2d);
		}
	}
	
	//we update all our enemies
	public void  update(Player p) {
		//we create a linkedlist to hold the enemies the player touched
		LinkedList<Enemy> enemyList = new LinkedList<Enemy>();
		//we go throw the enemies and we check if 
		//the rectangle of the player and
		//the rectangle of the enemy intersect if so 
		//we add the enemy on the enemyList that we will remove it
		for(Enemy e : enemies) {
			if(p.rect.intersects(e.rect)) {
				enemyList.add(e);
			}
			e.update();
		}
		//if we get enemies touched by the player we remove them all
		if(enemyList.size()>0) {
			for(Enemy e : enemyList) {
				enemies.remove(e);
			}
		}
	}
	
	
	//with this function we will get the enemies list 
	public LinkedList<Enemy> getEnemyCollection(){
		return enemies;
	}
}
