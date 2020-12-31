package com.dridichaith.src.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.dridichaith.src.objects.Player;

public class KeyInput implements KeyListener{
	Player p;
	public KeyInput(Player p) {
		this.p = p;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		p.keyPressed(e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		p.keyRelease(e);
	}

}
