package com.dridichaith.src;

import javax.swing.*;

public class MainClass {
	//make the title as static to be shared 
	public static final String TITLE = "Beginner Game";
	//make the with and length static that we can use it in the 
	//other classes
	public static final int WIDTH=640;
	public static final int HEIGTH=480;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame(TITLE);
		//activate the closing button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		//set the size of the frame
		frame.setSize(MainClass.WIDTH,MainClass.HEIGTH);
		//make it in the middle of the screen
		//you need to put it after setSize
		frame.setLocationRelativeTo(null);
		//add a game jpanel
		frame.add(new Game());
		frame.setVisible(true);

	}

}
