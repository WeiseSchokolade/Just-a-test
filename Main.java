package de.schoko.test;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		System.out.println("Ok I hate this");
		int i = 0;
		

		JLabel label = new JLabel("Hello!");
		

		label.setBounds(0, 0, 100, 50);
		label.setFont(new Font("Verdana", Font.PLAIN, 25));
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.add(label);
		while (true) {
			i++;
			label.setText(Integer.toString(i));
		}
	}
}
