package com.dridichaith.src;

import javax.swing.*;

public class MainClass {
	public static final String TITLE = "Beginner Game";
	public static final int WIDTH=640;
	public static final int HEIGTH=480;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame(TITLE);
		//frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setBounds(400,250,MainClass.WIDTH,MainClass.HEIGTH);
		frame.setResizable(false);
		//frame.setSize(640,448);
		frame.add(new Game());
		frame.setVisible(true);

	}

}
