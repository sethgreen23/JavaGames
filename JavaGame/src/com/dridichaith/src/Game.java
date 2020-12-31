package com.dridichaith.src;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements ActionListener{
	Timer timer;
	public Game() {
		setFocusable(true);
		timer = new Timer(10,this);
		timer.start();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Timer is one");
	}

}
