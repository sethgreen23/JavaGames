package com.dridichaith.src;

import javax.swing.*;

public class MainClass {
	public static final String TITLE = "Beginner Game";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame(TITLE);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setBounds(400,250,680,448);
		//frame.setSize(640,448);
		frame.add(new Game());
		frame.setVisible(true);

	}

}
